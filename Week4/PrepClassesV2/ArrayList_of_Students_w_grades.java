package PrepClassesV2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_of_Students_w_grades {
    public static void main(String[] args) {
//        ArrayList<Student> myStudents = new ArrayList<>();
        ArrayList<Student> students = getStudentData();

        showStudents( students );
    }
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static void showStudents(ArrayList<Student> students) {
        for( Student s : students ){
            System.out.printf("\n N:%s A:%s gpa:%s", s.getName(), s.getAge(), df.format(s.getGPA()));
        }
    }
    private static ArrayList<Student> getStudentData() {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<String> gr = new ArrayList<>(List.of( "A", "B", "C"));
        Student s1 = new Student("Moe", 23, gr);
        students.add( s1 );
        gr = new ArrayList<>(List.of( "D", "C", "C"));
        students.add( new Student("Larry", 22, gr));
        gr = new ArrayList<>(List.of( "A", "A", "B"));
        students.add( new Student("Curly", 21, gr));
        gr = new ArrayList<>(List.of( "B", "C", "C"));
        students.add( new Student("Jo", 20, gr));
        gr = new ArrayList<>(List.of( "A", "B", "C"));
        students.add( new Student("Shemp", 19, gr));
        return students;
    }
}
