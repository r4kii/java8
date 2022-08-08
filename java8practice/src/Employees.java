
import java.util.*;

public class Employees implements Iterable<Integer>{

    private List<Employee> emps = null;

    private List<Integer> number =null;

    private int a =21;

    public Employees() {

        emps = new ArrayList<Employee>();
        emps.add(new Employee(1001, "Rams", "Lead", 250000L));
        emps.add(new Employee(1002, "Posa", "Dev", 150000L));
        emps.add(new Employee(1003, "Chinni", "QA", 150000L));

        number = new ArrayList<>();
        number.add(1);
        number.add(14);
        number.add(1);
    }


    @Override
    public Iterator<Integer> iterator() {
        return number.iterator();
    }
}
