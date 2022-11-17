package class28;

import java.util.HashMap;
import java.util.Map;

public class Hw5 {
    public static void main(String[] args) {
        /*
        Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the
        highest salary. Output should be in the below format
        John Smith=$100000
         */

        Map<String, Integer> employee = new HashMap<>();
        employee.put("Jolly", 100000);
        employee.put("John", 120000);
        employee.put("Mary", 140000);
        employee.put("Smith", 160000);
        employee.put("Charlie", 180000);


        var iterator = employee.entrySet().iterator();
        Integer highestSalary = 0;
        String name = "";
        while (iterator.hasNext()) {
            var entry = iterator.next();
            var salary = entry.getValue();
            if (salary > highestSalary) {
                highestSalary = salary;
                name = entry.getKey();
            }
        }
        System.out.println(name + "=$" + highestSalary);
    }
}
