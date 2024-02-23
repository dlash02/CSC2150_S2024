import java.util.ArrayList;

public class Student {
    private String name;
    private String major;
    private int age;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String major, int age) {
        this.name = name;
        this.major = major;
        this.age = age;
    }
    public void addGrade( int grade){
        grades.add( grade );
    }
}
