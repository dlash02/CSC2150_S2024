public class Intro2Dim {
    public static void main(String[] args) {
       int[] myList = new int[14];
       // row and then col
       int[][] my2DimList = new int[5][6];
       my2DimList[0][1] = 15;
       my2DimList[0][0] = 12;

       char[][] seatSold = getSeatsSold();
       double[][] seatPrice = getSeatsCost();
       final double seatCost = 5.00;
//       double totalRevenue = getTotalRevenueVersion2( seatSold, seatPrice);
//       int bestRow = getRowWithMostRevnue( seatSold, seatPrice);
//        System.out.printf("Best Row:%s ", bestRow);
//        System.out.printf("\n Total Rev=%s", totalRevenue);
        showSeatingChart( seatSold);
    }

    private static int getTotalRowWithMostRenue(char[][] seatSold,
                                                        double[][] seatPrice) {
       double largestRowRev = 0.0;
       double currRowRev = 0.0;
       int bestRow = 0;
        for( int r=0; r<seatSold.length; r++) {
            currRowRev = 0.0;
            for (int c = 0; c < seatSold[r].length; c++) {
                if( seatSold[r][c] == 'X'){
                    currRowRev += seatPrice[r][c];
                }
            }
            if ( largestRowRev < currRowRev) {
                bestRow = r;
                largestRowRev = currRowRev;
            }
        }
        return bestRow;
    }

    private static double[][] getSeatsCost() {
        double[][] seatPrices = {
                { 200.00, 5.00, 5.00, 5.00, 5.00},
                { 5.00, 5.00, 5.00, 5.00, 5.00},
                { 7.50, 7.50, 7.50, 7.50, 7.50},
                { 7.50, 7.50, 7.50, 7.50, 7.50},
                { 7.50, 7.50, 7.50, 7.50, 7.50},
                { 5.00, 5.00, 5.00, 5.00, 5.00}
        };
        return seatPrices;
    }

    private static void showSeatingChart(char[][] seatSold) {
        for( int r=0; r<seatSold.length; r++){
            System.out.printf("\n");
           for( int c=0; c<seatSold[r].length; c++) {
               System.out.printf(" %s ", seatSold[r][c]);
           }
        }
    }

    private static double getTotalRevenue(char[][] seatSold, double seatCost) {
        double totRev = 0.00;
        for( char[] row : seatSold){
            for ( char seat : row ){
                if ( seat == 'X'){
                    totRev += seatCost;
                }
            }
        }
        return totRev;
    }

    private static char[][] getSeatsSold() {
//        char[][] seatSold = new char[6][5];
         char[][] seatSold = {
                 { 'X', ' ', 'X', 'X', ' '},
                 { 'X', 'X', 'X', 'X', 'X'},
                 { 'X', ' ', 'X', 'X', ' '},
                 { 'X', ' ', 'X', 'X', 'X'},
                 { 'X', ' ', 'X', 'X', ' '},
                 { 'X', 'X', ' ', 'X', 'X'},
         };
         return seatSold;
    }
}
