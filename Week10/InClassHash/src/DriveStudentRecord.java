import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriveStudentRecord {
    public static void main(String[] args) {
        String inFile = "students.txt";
        ArrayList<String> strRecords = getDataFromFile( inFile );
        HashMap< Integer, Student> byID = arrangeDataById( strRecords );
        System.out.printf("\n Size:%s", strRecords.size());
        System.out.printf("\n ID Size:%s", byID.size());
        promptUserForID( byID );

        HashMap<String, ArrayList<Student>> byMajor = arrangeDataByMajor( byID );
        showByMajor( byMajor);
//        HashMap<String, Integer> items = new HashMap<>();
//        items.put("Saw", 21);
//
//        if ( items.containsKey("Saw")){
//            int val = items.get("Saw") - 2;
//            items.put("Saw", val);
//        }
//        for( String key : items.keySet()){
//            System.out.printf("\n item:%s val:%s", key, items.get(key));
//        }

    }

    private static void showByMajor(HashMap<String, ArrayList<Student>> byMajor) {
        for( String major : byMajor.keySet()){
            ArrayList<Student> students = byMajor.get( major );
            System.out.printf("\n ---- Showing Major:%s ---", major);
            for( Student student : students ) {
                System.out.printf("\n - %s", student.toString());
            }
        }
    }

    private static HashMap<String, ArrayList<Student>> arrangeDataByMajor(HashMap<Integer,Student> byID) {
        HashMap<String, ArrayList<Student>> byMajor = new HashMap<>();
        for( Integer sId : byID.keySet()){
            Student sRec = byID.get(sId);
            String major = sRec.getMajor();
            if ( !byMajor.containsKey( major )){
                ArrayList<Student> students = new ArrayList<>();
                students.add( sRec );
                byMajor.put( major, students);
            } else {
                ArrayList<Student> students = byMajor.get( major );
                students.add( sRec );
                byMajor.put( major, students );
            }
        }
        return byMajor;
    }

    private static void promptUserForID(HashMap<Integer,Student> byID) {
        Scanner s = new Scanner( System.in);
        while ( true ) {
            System.out.printf("\n Enter Student ID-> or -1 to Quit");
            int sId = s.nextInt();
            if ( sId ==  -1 ){
                break;
            } else {
                if (!byID.containsKey( sId )){
                    System.out.printf("\n Invalid Sid:%s ", sId);
                } else {
                    Student student = byID.get(sId);
                    System.out.printf("\n Student Rec:%s", student.toString());
                }
            }
        }
    }

    private static HashMap<Integer,Student> arrangeDataById(ArrayList<String> strRecords) {
        HashMap<Integer,Student> byId = new HashMap<>();
        boolean isFirst = true;
        for( String row : strRecords){
            if ( isFirst ){
                isFirst = false;
                continue;
            }
            String[] toks = row.split(",");
            String firstName = toks[0];
            String lastName = toks[1];
            try {
                int birthYear = Integer.parseInt(toks[2]);
                double gpa = Double.parseDouble(toks[3]);
                String major = toks[4];
                int sId = Integer.parseInt(toks[5]);
                Student sRec = new Student(firstName, lastName, birthYear, gpa, major, sId);
                byId.put(sId, sRec);
            } catch( Exception e ) {
                System.out.printf("\n Bad Record:%s", row);
            }
        }
        return byId;
    }

    private static ArrayList<String> getDataFromFile(String inFile) {
        FileIO fio = new FileIO( inFile );
        ArrayList<String> dataRows = new ArrayList<>();
        try {
            fio.setFileData();
            dataRows = fio.getFileData();
        } catch ( FileNotFoundException e ){
            System.out.printf("\n FIle Not Found:%s", inFile);
            String loc = System.getProperty("user.dir");
            System.out.printf("\n Location:%s", loc);
            System.exit(1);
        }
            return dataRows;
    }
}
