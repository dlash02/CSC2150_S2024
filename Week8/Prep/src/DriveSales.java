import java.util.ArrayList;

public class DriveSales {
    public static void main(String[] args) {
        String file = "sales.txt";
        FileIO_Service fio = new FileIO_Service( file );
        ArrayList<String> rows = fio.getTheFile();
        ArrayList<Candy> candy = convertRowsToCandy( rows);
        showTheRows( rows );
        Candy item = getHighestMargin( candy );
        showThisCandy( item );
    }

    private static void showThisCandy(Candy item) {
        System.out.printf("\n Name:%s Price:%s cost:%s", item.getName(), item.getPrice(), item.getCost());
    }

    private static Candy getHighestMargin(ArrayList<Candy> candys) {
        double highestMargin = Double.MIN_VALUE;
        Candy bestMargin = null;
        for ( Candy item : candys){
            double margin  = item.getPrice() - item.getCost();
            if ( margin > highestMargin){
                highestMargin = margin;
                bestMargin = item;
            }
        }
        return bestMargin;
    }

    private static ArrayList<Candy> convertRowsToCandy( ArrayList<String> rows) {
//        Row:id,candy_name,sales,price,cost
//        Row:1,Chocolate Bar,50,1.50,1.00
//        Row:2,Gummy Bears,30,2.00,1.25
        ArrayList<Candy> candy = new ArrayList<>();
        int ct = 0;
        for( String row : rows ){
            if ( ct++ == 0 ) continue;
            String[] toks = row.split(",");
            String name = toks[1];
            try {
                int sales = Integer.parseInt(toks[2]);
                double price = Double.parseDouble(toks[3]);
                double cost = Double.parseDouble(toks[4]);
                candy.add(new Candy(name, sales, price, cost));
            } catch ( Exception e){
                System.out.printf("\n Bad Record ... skipping:%s \nmessage:%s", row, e.getMessage());
            }
        }
        return candy;
    }

    private static void showTheRows(ArrayList<String> rows) {
        for( String row : rows ){
            System.out.printf("\n Row:%s", row);
        }
    }
}
