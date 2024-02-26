package InClass;

import java.util.ArrayList;

public class DriveCandy {
    public static void main(String[] args) {
        // Read in the data
        String fName = "sales.txt";
        FileIO_Service fio = new FileIO_Service( fName );
        ArrayList<String> rows = fio.getTheFile();
        System.out.printf("\n Size:%s", rows.size());
        // Organize the data
        ArrayList<Candy> candy = organizeTheData( rows );
        System.out.printf("\n Size2:%s", candy.size());

        // process it to look for best profit margin
        Candy bestProfit = getBestProfitMargin( candy );
        // show the item with best profit margin
        showTheCandy( bestProfit );
    }

    private static void showTheCandy(Candy bestProfit) {
        System.out.printf("\n Name:%s Cost:%s sales:%s price:%s",
                bestProfit.getCandyName(), bestProfit.getCost(), bestProfit.getSales(), bestProfit.getPrice());
    }

    private static Candy getBestProfitMargin(ArrayList<Candy> candy) {
        Candy bestCandy = null;
        double bestPM = Double.MIN_VALUE;
        for ( Candy c : candy ) {
            double profit = c.getPrice() - c.getCost();
            if ( profit > bestPM){
                bestPM = profit;
                bestCandy = c;
            }
        }
        return bestCandy;
    }

    private static ArrayList<Candy> organizeTheData(ArrayList<String> rows) {
//        id,candy_name,sales,price,cost
//        1,Chocolate Bar,50,1.50,1.00
        ArrayList<Candy> candy = new ArrayList<>();
        int ct = 0;
        for ( String row : rows ){
            if ( ct++ == 0 ) {
                continue;
            }
            try {
                String[] toks = row.split(",");
                int id = Integer.parseInt(toks[0]);
                String name = toks[1];
                int sales = Integer.parseInt(toks[2]);
                double price = Double.parseDouble(toks[3]);
                double cost = Double.parseDouble(toks[4]);
//            (int id, String candyName, int sales, double price, double cost)
                Candy c = new Candy(id, name, sales, price, cost);
                candy.add(c);
            } catch ( Exception e ){
                System.out.printf("\n Bad Row:%s", row );
                System.out.printf("Exception was:%s", e.getMessage());
            }
        }
        return candy;
    }
}
