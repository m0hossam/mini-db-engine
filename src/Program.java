import java.util.Hashtable;

public class Program {
    public static void main(String[] args) {
        DBApp dbApp = new DBApp();

        String tableName = "Student";
        String clusteringKeyColumn = "id";

        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("id", "java.lang.Integer");
        htblColNameType.put("name", "java.lang.String");
        htblColNameType.put("gpa", "java.lang.double");

        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("id", "0");
        htblColNameMin.put("name", "A");
        htblColNameMin.put("gpa", "0");

        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("id", "10000");
        htblColNameMax.put("name", "ZZZZZZZZZZZ");
        htblColNameMax.put("gpa", "4");
        try {
            dbApp.createTable(tableName, clusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }
    }
}
