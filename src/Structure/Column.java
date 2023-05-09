package Structure;


import java.util.ArrayList;
import java.util.List;

public class Column {

    private String name;
    private DataTypes dataType;
    private List<Row> rows;

    public Column(String name, DataTypes dataType) {
        this.name = name;
        this.dataType = dataType;
        rows = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Row> getRows() {
        return new ArrayList<>(rows);
    }

    public boolean add(Row row) throws InvalidDataException {
        if (row.getType().equalsIgnoreCase(dataType.toString()))
            return rows.add(row);
        else
            throw new InvalidDataException("Row data type doesn't match column data type");
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Column column = (Column) o;
        return column.name.equalsIgnoreCase(name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

