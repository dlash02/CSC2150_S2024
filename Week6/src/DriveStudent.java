import java.util.ArrayList;

public class DriveStudent {
    public static void main(String[] args) {
        //t(String name, String major, int age)
        Student jack = new Student( "Jack", "CSC", 22);
        jack.addGrade( 99);
        Student jill = new Student( "Jill", "CYB", 21);
        ArrayList<Student> myStudents = new ArrayList<>();
        myStudents.add( jack);
        myStudents.add( jill);
        myStudents.add( new Student("James", "CYB", 29 ));

    }
}
