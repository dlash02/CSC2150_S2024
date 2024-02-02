package PrepClassesV2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayList_of_Students_w_grades {
    public static void main(String[] args) {
//        ArrayList<Student> myStudents = new ArrayList<>();
        ArrayList<Student> students = getStudentData();

        showStudents( students );

        // Grab a random student and add 1 to their age
        // Generate random integers in range 0 to 999
//        int rand_int1 = rand.nextInt(1000);
        Random rn = new Random();
        int r = rn.nextInt(students.size());
        Student randStudent = students.get( r );
        showThisStudent( randStudent );
        int newAge = randStudent.getAge() + 1;
        randStudent.setAge( newAge);
        showThisStudent( randStudent );
        // Construct a student w/o grades and add them in

        Student lateArriver = new Student( "Late Guy",  24);
        lateArriver.addGrade("A");
        lateArriver.addGrade("C");
        lateArriver.addGrade("B");
        showThisStudent( lateArriver );
        students.add( lateArriver );
        System.out.printf("\n ---- showing all students -----");
        showAllStudents( students );
    }
//    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static void showAllStudents(ArrayList<Student> students) {
        for( Student s : students ){
            showThisStudent( s );
        }
    }

    private static void showThisStudent(Student randStudent) {
        System.out.printf("\n Random student name:%s age:%s GPA:%s", randStudent.getName(), randStudent.getAge(),df.format(randStudent.getGPA()));
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static void showStudents(ArrayList<Student> students) {
        for( Student s : students ){
            System.out.printf("\n N:%s A:%s gpa:%s", s.getName(), s.getAge(), df.format(s.getGPA()));
            boolean first = true;
            String cma = "";
            System.out.printf(" Grades:");
            for( String grade : s.getGrades()){
                System.out.printf("%s %s", cma, grade);
                if ( first ) {
                    first =false;
                    cma = ",";
                }
            }
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
