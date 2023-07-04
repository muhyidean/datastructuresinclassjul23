package lesson05;

public class Employee implements Comparable{

    int id;
    String name;
    int hireDate;

    public Employee(int id, String name, int hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }

    @Override
    public int compareTo(Object obj) {
        Employee toCompareWith = (Employee) obj;

        if(this.id < toCompareWith.id)
            return -1;
        else if (this.id > toCompareWith.id)
            return 1;
        else
            return 0;
    }
}
