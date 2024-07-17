package db_components;

import java.io.Serializable;
import java.util.Vector;

public class Table implements Serializable {
    public final int clusteringKeyColumnIndex;
    public final Vector<Column> columns;
    public final Vector<Page> pages;

    public Table(Vector<Column> columns) {
        int tempIndex = 0;
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).isClusteringKeyColumn) {
                tempIndex = i;
                break;
            }
        }
        this.clusteringKeyColumnIndex = tempIndex;
        this.columns = columns;
        this.pages = new Vector<>();
    }
}
