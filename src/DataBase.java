import java.util.Map;
import java.util.TreeMap;

public class DataBase {

    private Map<String, String> dataBase = new TreeMap<>();
    private static DataBase instance;


    public DataBase() {}
    public static DataBase getInstance(){
        if (instance == null) {
            instance = new DataBase() ;
        }
        return instance;
    }

    public Map<String, String> getDataBase() {

        Map<String, String> backUpDB = new TreeMap<>(dataBase);
        return backUpDB;
    }


    public void addProperty(String tableName, String fileName) {
        dataBase.put(tableName,fileName);}

    public void removeProperty(String tableName, String fileName) {
        dataBase.remove(tableName,fileName);}
}
