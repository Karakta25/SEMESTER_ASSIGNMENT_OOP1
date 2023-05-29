package Structure;

import java.util.HashMap;
import java.util.Map;

public class Row {

    private Map<Integer, Column> columns = new HashMap<>();
    private int mapCounter = 0;

    public String getData(int index){
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Integer,Column> entry : columns.entrySet())
            sb.append(entry.getValue().getData(index)).append(" ");
        return sb.toString();
    }
    public void addColumn(Column column) {
        columns.put(mapCounter++, column);
    }

    public void insertData(Data... data) throws InvalidDataException {
        if (data.length != columns.size())
            throw new InvalidDataException("WRONG DATA SIZE");
        boolean dataIntegrity = true;
        for (int i = 0; i < columns.size(); i++) {
            if (!columns.get(i).getType().equalsIgnoreCase(data[i].getType()))
                dataIntegrity = false;
        }
        if (!dataIntegrity)
            throw new InvalidDataException("WRONG DATA TYPE");

        for (int i = 0; i < data.length; i++) {
            columns.get(i).setData(data[i]);
        }

    }

}
