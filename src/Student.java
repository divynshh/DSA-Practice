public class Student {

    private int id;
    private String name;
    private String city;
    private int marks;

    public Student(int id, String name, String city, int marks){
        this.id= id;
        this.city = city;
        this.name = name;
        this.marks = marks;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", marks=" + marks +
                '}';
    }
}
