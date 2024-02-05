import java.util.ArrayList;

public class StudentWGrades {
    // properities or attributes
    private String name;
    private int age;
    private String major;
    public String sport;
    private ArrayList<String> grades;
    public StudentWGrades(String name,
                          int age, String m, ArrayList<String> grades ) {
        this.name = name;
        this.age = age;
         major = m;
        sport = "football";
        this.grades = grades;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public double calcGPA(){
        // ToDo: Calculate the GPA using the grades
        //   provided to this student
        double gpa = 0.0;
        return gpa;
    }
}
