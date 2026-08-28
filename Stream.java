import java.util.*;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Stream {
    public static void Stream(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 50000),
                new Employee("Amit", 80000),
                new Employee("Raj", 100000),
                new Employee("Vijay", 80000),
                new Employee("Suresh", 60000)
        );

        Optional<Double> secondHighestSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(secondHighestSalary.orElse(null));
    }
}