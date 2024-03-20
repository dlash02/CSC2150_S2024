import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DriveStudentRecord {
    public static void main(String[] args) {
        String inFile = "students.txt";
        ArrayList<String> strRecords = getDataFromFile( inFile );
        System.out.printf("\n Size:%s", strRecords.size());

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
