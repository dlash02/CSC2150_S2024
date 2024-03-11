import java.util.*;

public class HashInClass {
    public static void main(String[] args) {

        HashMap<String, Double> myGrades = new HashMap<>();
        TreeMap<String, Double> myGrades2 = new TreeMap<>();
        LinkedHashMap<String, Double> myGrades3 = new LinkedHashMap<>();
        myGrades.put("HW1", 95.0);
        if ( myGrades.containsKey("HW1")){
            System.out.printf("\n Yep we got a HW1");
        } else {
            myGrades.put("HW1", 99.0);
        }
        myGrades.put( "HW2", 90.0);
        myGrades.put( "HW3", 100.0);
        myGrades.put( "HW4", 100.0);
        myGrades.remove("HW3");
        showAllMyGrades( myGrades);
        String uVal = getUserInput( myGrades);
        System.out.printf("\n The user wants to see:%s with value:%s", uVal, myGrades.get(uVal));
        double aver = getAverageGrade( myGrades);
        System.out.printf("\n Aver:%s", aver);
    }

    private static double getAverageGrade(HashMap<String, Double> myGrades) {
        double averGr = 0.0;
        double sum = 0;
        int ct = 0;
        for( String key : myGrades.keySet()){
            sum += myGrades.get(key);
            ct++;
        }
        if ( sum > 0){
            averGr = (sum)/ct ;
        }
        return averGr;
    }

    private static String getUserInput(HashMap<String, Double> myGrades) {
        String keys = myGrades.keySet().toString();
        String uInput;
        Scanner s = new Scanner(System.in); // Input from user

        while( true ){
            System.out.printf("\n Please enter one of these:%s", keys);
            uInput = s.next();
            if( myGrades.containsKey(uInput)){
                break;
            }
        }
        return uInput;
    }

    private static void showAllMyGrades(HashMap<String, Double> myGrades) {
        System.out.printf("\n --- Showing All grades");
        int ct = 1;
        for( String key : myGrades.keySet()){
            System.out.printf("\n G:%s key:%s, Val:%s", ct++, key,myGrades.get(key) );
        }
    }
}
