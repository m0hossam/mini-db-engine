package engine.table;

import java.io.Serializable;

public class Column implements Serializable {
    public final String name;
    public final String type;
    public final String min;
    public final String max;
    public final boolean isClusteringKeyColumn;

    public Column(String name, String type, String min, String max, boolean isClusteringKeyColumn) {
        this.name = name;
        this.type = type;
        this.min = min;
        this.max = max;
        this.isClusteringKeyColumn = isClusteringKeyColumn;
    }
}
