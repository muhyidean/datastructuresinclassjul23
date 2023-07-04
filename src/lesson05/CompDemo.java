package lesson05;


import java.util.*;

public class CompDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee(211, "Dean", 2010);
        Employee emp2 = new Employee(112,"Mira",2022);
        Employee emp3 = new Employee(113,"Zaineh",2014);

        Comparator empCompId = new EmployeeComparatorId();


        var r1 = empCompId.compare(emp1,emp2);
        var r2 = emp1.compareTo(emp2);

        List<Employee> employees = new ArrayList<>(Arrays.asList(emp1,emp2,emp3));

        Collections.sort(employees);


        for(Employee employee : employees){
            System.out.println(employee.name);
        }





    }




}
