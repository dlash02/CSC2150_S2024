package Reports;

import ModelPrep.DBAbstract;
import ModelPrep.DBInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentalDataTest {
    @Test
    void TestgetGPA_3CGPAGrades_shouldBeRight(){
        String dbName = "45.55.136.114:3306/STUDENT";
        DBAbstract dbAbstract = new DBAbstract( dbName, ".pw");
        DepartmentalData dd = new DepartmentalData( dbAbstract);
        double result = dd.getGPA( "CSC");
        double expected = 3.0;
        assertEquals( expected, result );
    }
    @Test
    void TestgetGPAUsingInterface_3CGPAGrades_shouldBeRight(){
        String dbName = "45.55.136.114:3306/STUDENT";
        DBInterface dbAbstract = new DBTestImplementation();
        DepartmentalData dd = new DepartmentalData( dbAbstract);
        double result = dd.getGPA( "CSC");
        double expected = 3.0;
        assertEquals( expected, result );
    }
}