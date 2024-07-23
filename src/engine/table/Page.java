package engine.table;

import engine.Config;

import java.io.Serializable;
import java.util.Vector;

public class Page implements Serializable {
    public final int MAX_ROWS = Config.MAX_ROWS_COUNT_IN_PAGE;
    public Vector<Row> rows;
}
