import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingObjects {

    public static void main(String[] args) {

        Student s1 = new Student(1,"Bruce","Chicago",80);
        Student s2 = new Student(2,"Tony","Massachusetts",20);
        Student s3 = new Student(3,"Steve","Brooklyn",30);
        Student s4 = new Student(3,"Anthony","San Jose",50);

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println(studentList);

        Collections.sort(studentList, new Comparator<Student>(){

            public int compare(Student a,Student b){
                return  a.getName().compareTo(b.getName());
            }

        });
        System.out.println("After");
        System.out.println(studentList);
    }

}
