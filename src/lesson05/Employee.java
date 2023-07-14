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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }
}
