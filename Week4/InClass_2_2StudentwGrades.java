import java.util.ArrayList;
import java.util.List;

public class InClass_2_2StudentwGrades {
    public static void main(String[] args) {
        ArrayList<StudentWGrades> students = getStudents();
        System.out.printf("Size:%s", students.size());
    }

    private static ArrayList<StudentWGrades> getStudents() {
        ArrayList<StudentWGrades> students = new ArrayList<>();
//            (String name, int age, String major)
        ArrayList<String> grades = new ArrayList<>(List.of("A", "B","B"));
        StudentWGrades s = new StudentWGrades( "Mo", 22, "CSC", grades );
//        System.out.printf("\n Name:%s Age:%s Major:%s", s.name, s.age, s.major);
        students.add( s );
        grades = new ArrayList<>(List.of("B", "B","B"));
        students.add( new StudentWGrades( "Larry", 21, "CSC", grades));
        grades = new ArrayList<>(List.of("B", "C","D"));
        students.add( new StudentWGrades( "Curly", 20, "Sleeping", grades));
        grades = new ArrayList<>(List.of("B", "C","D"));
        students.add( new StudentWGrades( "Shemp", 19, "Music", grades));
        students.add( new StudentWGrades( "Jo", 18, "Math", grades));
        return students;
        }
    }

