package InClass;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class HashPizzaToppings {
    public static void main(String[] args) throws FileNotFoundException {
        String fName = "toppings.txt";
        ArrayList<String> toppings = getDataFromFile( fName );
        System.out.printf("\n Size:%s", toppings.size());
//        HashMap<String, Integer> byTopping = countByTopping( toppings );
        TreeMap<String, Integer> byTopping = countByTopping( toppings );
        showToppingCt( byTopping);
    }

    private static ArrayList<String> getDataFromFile(String fName) throws FileNotFoundException {
        ArrayList<String> rows = new ArrayList<>();
        FileIO fio = new FileIO( fName );
        fio.setFileData();
        rows = fio.getFileData();
        return rows;
    }

    private static void showToppingCt(TreeMap<String, Integer> byTopping) {
        System.out.printf("\n --- AND THE RESULTS ARE ------");
        for( String key : byTopping.keySet()){
            System.out.printf("\nTopping:%s Ct:%s", key, byTopping.get(key));
        }
    }

    private static TreeMap<String, Integer> countByTopping(ArrayList<String> rows ) {
        TreeMap<String, Integer> byTopping = new TreeMap<>();
        for( String row : rows){
            String toks[] = row.split(";");
            String fav = toks[1];
            if ( !byTopping.containsKey(fav)){
                byTopping.put(fav, 1);
            } else {
                Integer topCt = byTopping.get(fav);
                topCt+=1;
                byTopping.put(fav, topCt);
            }
        }
        return byTopping;
    }

    private static ArrayList<String> getData() {
        ArrayList<String> rows = new ArrayList<>();
        rows.add( "Mike;Cheese;Onions");
        rows.add( "Maddie;Cheese;Pepperoni");
        rows.add( "Mason;Cheese;Pepperoni");
        rows.add( "Manny;Pepperoni;Sausage");
        rows.add( "Mitch;621;Sausage");
        rows.add( "Missie;Onions;Pepperoni");
        rows.add( "Micki;Onions;Cheese");
        rows.add( "Mike;Cheese;Cheese");
        return rows;
    }
}
