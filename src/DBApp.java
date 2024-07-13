import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;

public class DBApp {

    public DBApp() {
        init();
    }
    public void init() {
        // create a reader object on the properties file
        Properties properties;
        try (FileReader fileReader = new FileReader("resources/DBApp.config")) {
            properties = new Properties();
            properties.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int maxRowsInPage = Integer.parseInt(properties.getProperty("MaximumRowsCountInTablePage"));
        int maxEntriesInOctreeNode = Integer.parseInt(properties.getProperty("MaximumEntriesInOctreeNode"));
    }

    public void createTable(String strTableName,
                            String strClusteringKeyColumn,
                            Hashtable<String, String> htblColNameType,
                            Hashtable<String, String> htblColNameMin,
                            Hashtable<String, String> htblColNameMax) throws DBAppException {

    }

    public void createIndex(String strTableName, String[] strarrColName) throws DBAppException{

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