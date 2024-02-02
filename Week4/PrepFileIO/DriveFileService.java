package PrepFileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DriveFileService {
    public static void main(String[] args) {
        String fName = "inventory.txt";
        FileIO_Service fIO = new FileIO_Service( fName );
        ArrayList<String> fData =  fIO.getTheFile( );
        System.out.printf("\n ROwSize:%s", fData.size());
        int soldItem = getSoldItem( fData );
        fData = updateItemAsSold( fData, soldItem );
        showNewItems( fData );
        fName = "inventory3.txt";
        fIO.setfName( fName);
        fIO.saveTheData(  fData );
    }

    private static void showNewItems(ArrayList<String> fData) {
        for( String row: fData){
            System.out.printf("\n Row:%s",row );
        }
    }

    private static ArrayList<String> updateItemAsSold(ArrayList<String> fData, int soldItem) {
        String[] toks = fData.get( soldItem ).split(",");
        int nItems = Integer.parseInt(toks[2] );
        nItems -= 1;
        String nString = String.format("%s,%s,%s,%s", toks[0], toks[1], nItems, toks[3]);
        fData.set( soldItem, nString );
        return fData;
    }
    private static int getSoldItem(ArrayList<String> fData) {
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

}
