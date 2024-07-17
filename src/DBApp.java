import db_components.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DBApp {
    public static final int MAX_ROWS_COUNT_IN_PAGE;
    public static final int MAX_ENTRIES_IN_OCTREE_NODE;

    static { // static initializer for constants
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

    public Vector<Table> tables;

    public DBApp() {
        tables = new Vector<>();
    }

    public void init() {

    }

    public void createTable(String strTableName,
                            String strClusteringKeyColumn,
                            Hashtable<String, String> htblColNameType,
                            Hashtable<String, String> htblColNameMin,
                            Hashtable<String, String> htblColNameMax) throws DBAppException {
        Vector<Column> tableColumns = new Vector<>();
        htblColNameType.forEach((colName, colType) ->
            tableColumns.add(new Column(colName, colType, htblColNameMin.get(colName), htblColNameMax.get(colName), Objects.equals(colName, strClusteringKeyColumn)))
        );
        tables.add(new Table(tableColumns));
    }

    public void createIndex(String strTableName, String[] strarrColName) throws DBAppException {

    }

    public void insertIntoTable(String strTableName, Hashtable<String,Object> htblColNameValue) throws DBAppException {

    }

    public void updateTable(String strTableName, String strClusteringKeyValue, Hashtable<String,Object> htblColNameValue ) throws DBAppException {

    }

    public void deleteFromTable(String strTableName, Hashtable<String,Object> htblColNameValue) throws DBAppException {

    }

    public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) throws DBAppException {
        return null;
    }
}