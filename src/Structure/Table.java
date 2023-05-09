package Structure;

import java.util.HashSet;
import java.util.Set;


public class Table {

    private String name;
    private Set<Column> columns;


    public Table(String name) {
        this.name = name;
        columns = new HashSet<>();
    }

    public boolean addColumn(Column column) {
        return columns.add(column);
    }

    public boolean insertRow(Object objects[]) throws InvalidDataException {

        /*int counter = 0;
        for (Column i : columns) {
            i.add(new Row(objects[counter]));

            counter++;
        }

*/
        return false;
    }
    public boolean insertRowInColumn(String columnName, Row row) throws InvalidDataException {
        for (Column i : columns) {
            if (i.getName().equalsIgnoreCase(columnName)) {
                return i.add(row);
            }
        }
        return false;
    }

    public String displayTable() {
        StringBuilder sb = new StringBuilder();

        for (Column i : columns) {
            sb.append(i).append("\n");
            for (Row j : i.getRows()) {
                sb.append(j.getData().toString()).append("\n");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public String displayColumnNames() {
        StringBuilder sb = new StringBuilder("Displaying the names of all columns in table " + name + "\n");
        for (Column i : columns) {
            sb.append(i).append("\n");
        }
        return sb.toString();
    }
}
