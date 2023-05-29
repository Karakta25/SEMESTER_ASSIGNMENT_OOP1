package Structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private String name;
    //private static int mapCounter = 0;
    private Row row=new Row();

    public Table(String name) {
        this.name = name;
    }

    public void addColumn(Column column) {
        row.addColumn(column);
    }

    public void InsertIntoTable(Data... data) throws InvalidDataException {
        row.insertData(data);
    }

    public String printData(int index){
        return row.getData(index);
    }


}
