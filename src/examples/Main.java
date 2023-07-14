package examples;

import lesson05.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(111,new Employee(111,"dean",2012));
        employeeMap.put(112,new Employee(112,"hebron",2024));
        employeeMap.put(113,new Employee(113,"eden",2023));
        employeeMap.put(114, employeeMap.get(111));


        // Traversing through the map and printing out the associated objects
        for (Integer key : employeeMap.keySet()){
            System.out.println(employeeMap.get(key)); //
        }

        // Adding the elements in the map to a Set to retrieve distinct values in one collection
        Set<Employee> employeeSet  = new HashSet<>();

        for (Integer key : employeeMap.keySet()){
            employeeSet.add(employeeMap.get(key));
        }

        System.out.println(employeeSet);
    }

}
