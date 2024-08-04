package engine.table;

import java.io.Serializable;
import java.util.Hashtable;

public class Row implements Serializable {
    public final Hashtable <String, Object> colNameValue;

    public Row(Hashtable<String,Object> htblColNameValue) {
        this.colNameValue = htblColNameValue;
    }
}
