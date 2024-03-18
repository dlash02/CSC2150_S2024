package HashPrep;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriveStudentRecords {
    public static void main(String[] args) {
        String inFile = "students.txt";
        ArrayList<String> strStudents = getInputDataAsStrings( inFile  );
        // Part 1 - Array Data by student id
        //        = Each student id can have 1 student record
        HashMap<Integer, Student> byId = arrangeById( strStudents);
        System.out.printf("\n Got Size:%s", strStudents.size());
        showStudentRecords( byId );
        // Part 2 - Arrange data by Major
        //         - Each major can have a list of students
        HashMap<String, ArrayList<Student>> byMajor = arrangeByMajor( byId );
        showStudentsByMajor( byMajor);
    }
    private static void showStudentsByMajor(HashMap<String, ArrayList<Student>> byMajor) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.printf("\n --- Enter Major To Show or Q to Quit ->");
            String inMajor = s.next();
            if ( inMajor.equals("Q") ) break;
            if ( byMajor.containsKey( inMajor )){
                ArrayList<Student> byMajorRows = byMajor.get( inMajor);
                int ct = 1;
                for( Student student : byMajorRows){
                    System.out.printf("\nCt:%s Student:%s", ct++, student.toString());
                }
            } else {
                System.out.printf("\n Sorry we don't have any major:%s ... try again", inMajor);
            }
        }
    }
    private static HashMap<String, ArrayList<Student>> arrangeByMajor(HashMap<Integer, Student> byId) {
        HashMap<String, ArrayList<Student>> byMajor = new HashMap<>();
        for( Integer id : byId.keySet() ){
            Student s = byId.get( id );
            String major = s.getMajor();
            if ( byMajor.containsKey( major)){
                ArrayList<Student> studentMajors = byMajor.get(major);
                studentMajors.add( s);
                byMajor.put( major, studentMajors);
            } else {
                ArrayList<Student> studentMajors = new ArrayList<>();
                studentMajors.add( s );
                byMajor.put( major, studentMajors);
            }
        }
        return byMajor;
    }

    private static void showStudentRecords( HashMap<Integer, Student> byID ) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.printf("\n --- Enter Student Id To Show or -1 to Quit ->");
            int id = 0;
            try {
                id = s.nextInt();
                if ( id == -1 ) break;
                if ( byID.containsKey( id )){
                    Student student = byID.get(id);
                    System.out.printf("\n Record for %s is %s", id, student.toString() );
                } else {
                    System.out.printf("\n Sorry we do not have a record for id:%s", id);
                }

            } catch (Exception e) {
                System.out.printf("\n Input %s must be an integer.... try again!", id);
                s.nextLine(); // Needed to clear line after error
            }
        }
    }
    private static HashMap<Integer, Student> arrangeById(ArrayList<String> strStudents) {
        HashMap<Integer, Student> byId = new HashMap<>();
        boolean first = true;
        int ct = 1;
        for( String student : strStudents){
            //First Name,Last Name,Birth Year,GPA,Major,Student ID
            if ( first ) {
                first = false;
                continue;
            }
            ct++;
            String toks[] = student.split(",");
            try{
                String firstName = toks[0];
                String lastName = toks[1];
                int birth = Integer.parseInt(toks[2]);
                double gpa = Double.parseDouble(toks[3]);
                String major = toks[4];
                int studentId = Integer.parseInt(toks[5]);
                //tudent(String first, String last, int birthYear, double GPA, String major, int sId
                Student s = new Student( firstName, lastName, birth, gpa, major, studentId );
                byId.put( studentId, s );
            } catch ( Exception e ){
                System.out.printf("\n Bad Record Line:%s record:%s ", ct, student );
            }
        }
        return byId;
    }

    private static ArrayList<String> getInputDataAsStrings(String inFile) {
        ArrayList<String> rows = new ArrayList<>();
        FileIO fio = new FileIO( inFile);
        try {
            fio.setFileData();
            rows = fio.getFileData();
        } catch ( FileNotFoundException e){
            System.out.printf("\n Error File Not Found! fName:%s", inFile );
            String loc = System.getProperty("user.dir");
            System.out.printf("\n Loc:%s", loc );
            System.exit(1);
        }
        return rows;
    }
}
