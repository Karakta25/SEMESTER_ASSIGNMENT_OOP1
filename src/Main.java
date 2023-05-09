import java.util.Map;
import java.util.TreeMap;
import Structure.*;
public class Main {
    public static void main(String[] args) throws InvalidDataException {

        Table table = new Table("Student");
        System.out.println(table.addColumn(new Column("Name", DataTypes.STRING))); //С тези два реда демонстрирам че не могат да се създават
        System.out.println(table.addColumn(new Column("name", DataTypes.STRING))); //колони с еднакви имена
        table.addColumn(new Column("Age", DataTypes.INTEGER));

        System.out.println();
        table.insertRowInColumn("name", new Row("Ivan"));
        table.insertRowInColumn("name", new Row("Peter"));
        table.insertRowInColumn("name", new Row("Kara"));
        table.insertRowInColumn("age", new Row(12));
        table.insertRowInColumn("age", new Row(43));
        table.insertRowInColumn("age", new Row(17));

        System.out.println();
        System.out.println(table.displayColumnNames());

        //System.out.println(table.displayTable());


        //Object objects[] = {"Martin", 12};
        //table.insertRow(objects);
    }
}