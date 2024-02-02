package PrepFileIO;

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
    private int getSoldItem(ArrayList<String> fData) {
        System.out.printf("\n Item List:");
        boolean keepGoing = true;
        int item = 0;
        while( keepGoing) {
            for (int i = 0; i < fData.size(); i++) {
                String[] toks = fData.get(i).split(",");
                System.out.printf("\n N:%s Item:%sm nLeft:%s", toks[0], toks[1], toks[2]);
            }
            System.out.printf("\n Enter Item Number->");
            Scanner s = new Scanner(System.in);
            item = s.nextInt();
            if (item >= 1 && item <= fData.size()) {
                keepGoing = false;
            } else {
                System.out.printf("\n That item is not legal");
            }
        }
        return item;
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
