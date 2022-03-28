import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapwithUKey {

    public static void main(String[] args) {
        HashMap<Employee,String> map = new HashMap<>();


        Employee s1 = new Employee(1,"Tony");
        Employee s2 = new Employee(1,"Tony");

        map.put(s1,"Employee1");
        map.put(s2,"Employee2");


        for (Map.Entry x: map.entrySet()
             ) {

            System.out.println(x.getKey() + " - " + x.getValue());

        }
    }
}


class Employee{

    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
