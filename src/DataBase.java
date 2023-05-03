import java.util.List;
import java.util.Map;

public class DataBase {

    private Map<String, String> dataBaseElements;

    public DataBase(Map<String, String > dataBaseElements) {
        this.dataBaseElements = dataBaseElements;
    }

    public Map<String, String> getDataBaseElements() {
        return dataBaseElements;
    }
}
