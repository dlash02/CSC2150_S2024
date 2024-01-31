package PrepClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_of_Objects {
    public static void main(String[] args) {
//        ArrayList<Student> myStudents = new ArrayList<>();
        ArrayList<Student> students = getStudentData();
        final int AGE = 20;
        ArrayList<Student> olderStudents = getStudentsObjestOlderThan( students, AGE);

        showOlderStudents( olderStudents );
    }
    private static ArrayList<Student> getStudentsObjestOlderThan(ArrayList<Student> students, int age) {
        ArrayList<Student> olderStudents = new ArrayList<>();
            int ct = 0;
            for( Student student : students){
                if ( student.getAge() > age  ){
                    olderStudents.add( student );
                }
            }
            return olderStudents;
    }
    private static void showOlderStudents( ArrayList<Student> olderStudents ) {
        for( Student student : olderStudents){
            System.out.printf("\n Student:%s Age:%s", student.getName(), student.getAge());
        }
    }

    private static ArrayList<Integer> getStudentsOlderThanByAge(ArrayList<String> students,
                                                                ArrayList<Integer> ages, int inAge) {
        ArrayList<Integer> retList = new ArrayList<>();
        for ( int i=0; i<students.size(); i++ ){
            if ( ages.get(i) > inAge ) {
                  retList.add( ages.get(i));
            }
        }
        return retList;
    }
    private static ArrayList<String> getStudentsOlderThan(ArrayList<String> students,
                                                          ArrayList<Integer> ages, int targetAge) {
        ArrayList<String> olderStudents = new ArrayList<>();

//        for ( int age : ages ){
        for ( int i=0; i<ages.size(); i++){ 
            if( ages.get(i) > targetAge ){
                olderStudents.add( students.get(i));
            }
        }
        return olderStudents;
    }

    private static ArrayList<Student> getStudentData() {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Moe", 23);
        students.add( s1 );
        students.add( new Student("Larry", 22));
        students.add( new Student("Curly", 21));
        students.add( new Student("Jo", 20));
        students.add( new Student("Shemp", 20));
        return students;
    }
}
