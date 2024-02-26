import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO_Service {
    private String fName;
    public FileIO_Service(String fName) {
        this.fName = fName;
    }
    public void setfName( String fName ){
        this.fName = fName;
    }
    public ArrayList<String> getTheFile() {
        ArrayList<String> rows = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
        try (Scanner fileScanner = new Scanner(new File(fName))) {
            // Read from the input file using Scanner and output to the console
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                rows.add( line );
            }
            System.out.println("Data read from the file and printed to console successfully!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return rows;
    }

    public void saveTheData( ArrayList<String> fData) {
        try ( FileWriter fileWriter = new FileWriter(fName)) {
            // Read from the input file using Scanner and write to the output file using FileWriter
            for ( String row : fData ){
                fileWriter.write(row + "\n");
            }
            System.out.printf("Data written to the file:%s  successfully!", fName );
        } catch (IOException e) {
            System.err.println("Error reading/writing the file: " + e.getMessage());
        }
    }
}
