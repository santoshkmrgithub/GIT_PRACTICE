import java.util.*;
import java.util.stream.Collectors;

public class SecondHighest {

    public static void main(String[] args) {

        // HashMap<EmployeeId, Salary>
        Map<Integer, Integer> employees = new HashMap<>();

        employees.put(101, 50000);
        employees.put(102, 80000);
        employees.put(103, 60000);
        employees.put(104, 100000);
        employees.put(105, 90000);
        employees.put(106, 100000);
        employees.put(107, 70000);

        // Print HashMap
        System.out.println("Employees: " + employees);

        // =========================
        // 2nd Highest Salary
        // =========================

        Optional<Integer> secondHighestSalary =
                employees.values()
                        .stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();

        System.out.println(
                "2nd Highest Salary: "
                        + secondHighestSalary.orElse(0)
        );
    }
}