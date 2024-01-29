package Reports;

import ModelPrep.DBAbstract;
import ModelPrep.DBInterface;

import java.util.ArrayList;

public class DepartmentalData {
    DBInterface dbAbstract;
    ArrayList<Student> students;
    public DepartmentalData(DBInterface dbAbstract) {

        this.dbAbstract = dbAbstract;
        setStudentData();
    }
    public void setStudentData(){
        String dbName = "45.55.136.114:3306/STUDENT";
        String items = "StudentID, FirstName, LastName, Major, gpa";
//        DBAbstract dbAbstract = new DBAbstract( dbName, ".pw");
        students = new ArrayList<>();
        String sql = String.format("Select %s from STUDENTS", items );
        ArrayList<String> DBResults = dbAbstract.doQueryAL( sql );
        int ct = 0;
        for( String row : DBResults){
            System.out.printf("\n ct:%s ROW:%s", ++ct, row);
            String[] toks = row.split(";");
            int sId = Integer.parseInt( toks[0]);
            String first = toks[1];
            String last = toks[2];
            String major = toks[3];
            double gpa = Double.parseDouble( toks[4]);
            //    private  int StudentID;
            //    private String FirstName;
            //    private String LastName;
            //    private String Major;
            //    private double gpa;
            students.add( new Student( sId, first, last, major, gpa));
        }

    }
    public double getGPA( String inMajor ){
        double gpa = 0.0;
        int ct = 0;
        double sum = 0.0;
        for( Student s : students ){
            if ( s.getMajor().equals(inMajor)){
                sum  += s.getGpa();
                ct++;
            }
        }
        System.out.printf("\n ---------- Sum%s ct:%s", sum, ct);
        if ( sum > 0 ){
            gpa = sum/ct;
        }
        return gpa;
    }

}
