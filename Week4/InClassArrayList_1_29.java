import java.util.ArrayList;
import java.util.List;

public class InClassArrayList_1_29 {
    public static void main(String[] args) {
//        ArrayList<Integer> myNums = new ArrayList<>(100);
//        int[] myNums2 = new int[100];
//        ArrayList<String> students = new ArrayList<>();
        ArrayList<String> students = getStudents();
        ArrayList<Integer> ages = getStudentAges();
        final int AGE = 20;
        ArrayList<String> olderStudents = getStudentsOlderThan( students, ages, AGE);
        ArrayList<Integer> olderStudentsAges = getStudentsOlderThanByAge( students, ages, AGE);
//        showOlderStudents( olderStudents);
        showOlderStudentsAndAge( olderStudents, olderStudentsAges);
    }

    private static void showOlderStudentsAndAge(
            ArrayList<String> olderStudents, ArrayList<Integer> olderStudentsAges) {
        int ct = 0;
        for( String student : olderStudents){
            System.out.printf("\n Student:%s Age:%s", student, olderStudentsAges.get(ct++));
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

    private static void showOlderStudents(ArrayList<String> olderStudents) {
        for( String student : olderStudents){
            System.out.printf("\n Student:%s", student );
        }
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

    private static ArrayList<Integer> getStudentAges() {
        ArrayList<Integer> myList =  new ArrayList<>(List.of(23, 22, 21, 20, 19));
        return myList;
    }

    private static ArrayList<String> getStudents() {
//        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> myList =  new ArrayList<>(List.of("Moe", "Larry","Curly"));
        myList.add( "Jo");
        myList.add( "Shemp");
        return myList;
    }
}
