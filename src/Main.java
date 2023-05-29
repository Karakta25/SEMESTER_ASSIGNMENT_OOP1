import java.util.HashMap;
import java.util.Map;
import Structure.*;
public class Main {
        public static void main(String[] args) throws InvalidDataException {

            Table students = new Table("Students");
            students.addColumn(new Column("Name", DataTypes.STRING));
            students.addColumn(new Column("Age", DataTypes.INTEGER));
            students.addColumn(new Column("Address", DataTypes.STRING));
            students.addColumn(new Column("FN", DataTypes.STRING));
            students.addColumn(new Column("Grade", DataTypes.DOUBLE));
            students.InsertIntoTable(new Data("Dimitar"),new Data(21),new Data("Varna"),new Data("28394223"),new Data(4.30));
            students.InsertIntoTable(new Data("Ivan"),new Data(19),new Data("Varna"),new Data("67854567"),new Data(5.10));
            System.out.println(students.printData(0));
            System.out.println(students.printData(1));


            Table football=new Table("Teams");
            football.addColumn(new Column("Name",DataTypes.STRING));
            football.addColumn(new Column("Year Created",DataTypes.INTEGER));
            football.addColumn(new Column("Money spent",DataTypes.DOUBLE));
            football.InsertIntoTable(new Data("Beroe"),new Data(1920),new Data(13.5));
            System.out.println(football.printData(0));


        }
}