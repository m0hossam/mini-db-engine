package engine;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public final class Config {
    public static final int MAX_ROWS_COUNT_IN_PAGE;
    public static final int MAX_ENTRIES_IN_OCTREE_NODE;

    static {
        Properties properties;
        try (FileReader fileReader = new FileReader("resources/DBApp.config")) {
            properties = new Properties();
            properties.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MAX_ROWS_COUNT_IN_PAGE = Integer.parseInt(properties.getProperty("MaximumRowsCountInTablePage"));
        MAX_ENTRIES_IN_OCTREE_NODE = Integer.parseInt(properties.getProperty("MaximumEntriesInOctreeNode"));
    }

    private Config() {}
}
