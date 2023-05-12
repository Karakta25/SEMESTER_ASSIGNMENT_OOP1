package Structure;

import java.util.Map;
import java.util.TreeMap;

public class DataBase {

    private static Map<String, String> dataBase;
    private static DataBase instance;


    public DataBase() {}
    public static DataBase getInstance(){
        if (instance == null) {
            instance = new DataBase();
            dataBase = new TreeMap<>();
        }
        return instance;
    }

    public Map<String, String> getDataBase() {
        return new TreeMap<>(this.dataBase);
    }


    public void addProperty(String tableName, String fileName) {
        dataBase.put(tableName,fileName);}

    public void removeProperty(String tableName, String fileName) {
        dataBase.remove(tableName,fileName);}
}
