package Structure;

import java.util.HashMap;
import java.util.Map;

public class Column {

    private String name;
    private Map<Integer,Data> data=new HashMap<>();
    private int numberOfRows=0;
    private DataTypes dataType;

    public Column(String name, DataTypes dataType) {
        this.name = name;
        this.dataType = dataType;
    }


    public Data getData(int index){
        return data.get(index);
    }
    public void setData(Data data) {
        this.data.put(numberOfRows++,data);
    }

    public String getType() {
        return dataType.toString();
    }


}