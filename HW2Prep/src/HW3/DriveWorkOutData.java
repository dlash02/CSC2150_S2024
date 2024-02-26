package HW3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DriveWorkOutData  {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> stringData = getWorkOutData();
//        System.out.printf("\n size:%s", stringData.size());
        ArrayList<WorkOut> workOuts = convertStringsToData( stringData);
        ArrayList<Integer> byWeek = averageByWeek( workOuts);
        showCaloriesByWeek( byWeek );
    }

    private static void showCaloriesByWeek(ArrayList<Integer> byWeek) {
        int week = 1;
        for( Integer item : byWeek ){
            System.out.printf("\n week:%s cals:%s", week++, item );
        }
    }

    private static ArrayList<Integer> averageByWeek(ArrayList<WorkOut> workOuts) {
        ArrayList<Integer> byWeek = new ArrayList<>();
        int nWeeks = workOuts.size()/7;
        int ct = 0;
        for( int i=0; i<nWeeks; i++){
            int cCals = 0;
            int wCals = 0;
            for( int j=0; j<7; j++) {
                cCals += workOuts.get(ct).getCardioCalories();
                wCals += workOuts.get(ct).getWeightCalories();
                System.out.printf("\nCCalc:%s", cCals);
                System.out.printf("\nCwalc:%s", wCals);
                ct++;
            }
            byWeek.add((cCals + wCals));
        }
        return byWeek;
    }

    private static ArrayList<WorkOut> convertStringsToData(ArrayList<String> stringData) {
        ArrayList<WorkOut> workOuts = new ArrayList<>();
        for( String row : stringData){
            String toks[] = row.split(",");
            //1,60,H,60,M
            int day = Integer.parseInt(toks[0]);
            int cMin = Integer.parseInt(toks[1]);
            char cInten = toks[2].charAt(0);
            int wMin = Integer.parseInt(toks[3]);
            char wInten = toks[4].charAt(0);
            WorkOut w = new WorkOut( day, cMin, cInten, wMin, wInten);
            workOuts.add( w );
            }
        return workOuts;
    }

    private static ArrayList<String> getWorkOutData() throws FileNotFoundException {
        String inFile = "workoutsTest.txt";
        FileIO fio = new FileIO( inFile );
        ArrayList<String> retData = fio.getFileData();
        try {
            fio.setFileData();
            System.out.printf("\n size:%s", retData.size());
        } catch(FileNotFoundException e) {
            System.out.printf("FileNot Found %s", inFile);
        }
        return retData;
    }
}
