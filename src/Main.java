import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new TechnicalWriter("Mark", 50000, 4, 2));
        employeeList.add(new Engineer("Natashia", 50000, 7, 2));
        employeeList.add(new ProductManager("Carlos", 50000, 8, 5));
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
            System.out.println();
        }
    }
}