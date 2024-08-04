package engine;

import engine.exceptions.DBAppException;
import engine.table.*;

import java.util.*;

public class DBApp {
    public final Vector<Table> tables;

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
        tables.add(new Table(strTableName, tableColumns));
    }

    public void createIndex(String strTableName, String[] strarrColName) throws DBAppException {

    }

    public void insertIntoTable(String strTableName, Hashtable<String,Object> htblColNameValue) throws DBAppException {
        for (Table table : tables) {
            if (Objects.equals(table.name, strTableName)) {
                table.insertRow(htblColNameValue);
                break;
            }
        }
    }

    public void updateTable(String strTableName, String strClusteringKeyValue, Hashtable<String,Object> htblColNameValue ) throws DBAppException {

    }

    public void deleteFromTable(String strTableName, Hashtable<String,Object> htblColNameValue) throws DBAppException {

    }

    public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) throws DBAppException {
        return null;
    }
}