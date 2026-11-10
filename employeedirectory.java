import java.util.*;

class Employee {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return id + " " + name + " " + department;
    }
}

public class EmployeeDirectory {
    public static void main(String[] args) {

        // Using ArrayList
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(101, "Amit", "IT"));
        list.add(new Employee(102, "Priya", "HR"));
        list.add(new Employee(103, "Rahul", "Sales"));

        System.out.println("Employee using ArrayList:");

        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Using HashSet
        HashSet<String> departments = new HashSet<String>();

        departments.add("IT");
        departments.add("HR");
        departments.add("Sales");
        departments.add("IT");

        System.out.println("\nDepartments using HashSet:");

        for (String dept : departments) {
            System.out.println(dept);
        }

        // Using HashMap
        HashMap<Integer, Employee> map =
                new HashMap<Integer, Employee>();

        for (Employee e : list) {
            map.put(e.id, e);
        }

        System.out.println("\nEmployee retrieved using HashMap:");
        System.out.println(map.get(101));

        // Add new Employee
        Employee newEmp =
                new Employee(104, "Sneha", "Finance");

        list.add(newEmp);
        map.put(newEmp.id, newEmp);

        System.out.println("\nEmployee count: " + list.size());

        System.out.println("Employee at ID 104:");
        System.out.println(map.get(104));
    }
}
