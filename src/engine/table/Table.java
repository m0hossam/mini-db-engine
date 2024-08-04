package engine.table;

import engine.exceptions.DBAppException;
import engine.exceptions.MaxPagesException;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

public class Table implements Serializable {
    public final String name;
    public final Vector<Column> columns;
    public final Vector<Page> pages;
    public final int clusteringKeyColumnIndex;

    public Table(String strName, Vector<Column> vecColumns) {
        this.name = strName;
        this.columns = vecColumns;
        this.pages = new Vector<>();

        int tempIndex = 0;
        for (int i = 0; i < vecColumns.size(); i++) {
            if (vecColumns.get(i).isClusteringKeyColumn) {
                tempIndex = i;
                break;
            }
        }
        this.clusteringKeyColumnIndex = tempIndex;
    }

    public void insertRow(Hashtable<String,Object> htblColNameValue) throws MaxPagesException {
        if (pages.isEmpty()) {
            pages.add(new Page());
        }
        if (pages.lastElement().isFull()) {
            pages.add(new Page());
        }
        pages.lastElement().addRow(htblColNameValue);
    }
}
