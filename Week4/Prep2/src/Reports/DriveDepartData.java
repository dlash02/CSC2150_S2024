package Reports;

import ModelPrep.DBAbstract;
import ModelPrep.DBInterface;

import java.util.ArrayList;

public class DriveDepartData {
    public static void main(String[] args) {
        String dbName = "45.55.136.114:3306/STUDENT";
       DBInterface dbAbstract = new DBAbstract( dbName, ".pw");

//        String sql = "Select * from STUDENTS";
//        ArrayList<String> DBResults = dbAbstract.doQueryAL( sql );
//        for( String row : DBResults){
//            System.out.printf("\n ROW:%s", row);
//        }
        DepartmentalData dData = new DepartmentalData( dbAbstract );
//        dData.setStudentData();
        String major = "CSC";
        System.out.printf("\n Average GPA of %S is %s", major, dData.getGPA("CSC"));
    }
}
