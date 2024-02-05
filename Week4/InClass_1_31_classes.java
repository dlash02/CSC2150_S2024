import java.util.ArrayList;

public class InClass_1_31_classes {
        public static void main(String[] args) {
            int x = 10;
            Integer y = 10;
            ArrayList<Student> students = getStudents();
            final int AGE = 20;
            ArrayList<Student> olderStudents = getStudentsOlderThan( students, AGE);
            showOlderStudents( olderStudents );
            int ct = countTheseMajors( students, "CSC");
            System.out.printf("\n Count of CSC majors:%s", ct );

            Student s = new Student( "Fred", 20, "CSC");
            String name = s.getName();
            String sport = s.sport;
            s.sport = "Soccer";
            s.setAge( 45 );
            System.out.printf("\n S:%s age:%s sport:%s",
                              s.getName(), s.getAge(), s.sport);

        }

    private static int countTheseMajors(ArrayList<Student> students, String inMajor ) {
            int ct = 0;
        for( Student s : students ){
            if ( s.getMajor().equals(inMajor)){
                ct++;
            }
        }
            return ct;
    }

    private static void showOlderStudents(ArrayList<Student> olderStudents) {
            for( Student s : olderStudents){
//                System.out.printf("\nN:%s A:%s M:%s", s.name, s.age, s.major);
                System.out.printf("\nN:%s A:%s M:%s", s.getName(), s.getAge(), s.getMajor());
            }
    }

    private static ArrayList<Student> getStudentsOlderThan(ArrayList<Student> students, int age) {
        ArrayList<Student> olderStudents = new ArrayList<>();
        for( Student s : students ){
            if ( s.getAge() > age ){
                olderStudents.add( s);
            }
        }
        return olderStudents;
    }

    private static ArrayList<Student> getStudents() {
            ArrayList<Student> students = new ArrayList<>();
//            (String name, int age, String major)
            Student s = new Student( "Mo", 22, "CSC" );
//        System.out.printf("\n Name:%s Age:%s Major:%s", s.name, s.age, s.major);
        students.add( s );
        students.add( new Student( "Larry", 21, "CSC"));
        students.add( new Student( "Curly", 20, "Sleeping"));
        students.add( new Student( "Shemp", 19, "Music"));
        students.add( new Student( "Jo", 18, "Math"));
        return students;
    }
}
