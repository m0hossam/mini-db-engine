package engine.table;

import engine.Config;
import engine.exceptions.DBAppException;
import engine.exceptions.MaxPagesException;
import engine.util.UniqueIdGenerator;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

public class Page implements Serializable {
    public final int MAX_ROWS;
    public final long PAGE_ID;
    private final Vector<Row> rows;

    public Page() throws MaxPagesException {
        MAX_ROWS = Config.MAX_ROWS_COUNT_IN_PAGE;
        PAGE_ID = UniqueIdGenerator.acquireId();
        rows = new Vector<>();
    }

    public boolean isFull() {
        return rows.size() == MAX_ROWS;
    }

    public void addRow(Hashtable<String,Object> htblColNameValue) {
        Row row = new Row(htblColNameValue);
        rows.add(row);
    }
}
