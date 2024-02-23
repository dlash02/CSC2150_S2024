public class Drive_3DigitSort {
    public static void main(String[] args) {
        int[] digit3 = {0,2, 3, 4, 2, 3, 4, 2, 4, 1 };
        Sort3Digit sort3D = new Sort3Digit( digit3 );
//        int[] sortList = sort3D.sort3Digits();
         int[] sortList = sort3D.sort5Digits(6);
        showSortList( sortList);
    }

    private static void showSortList(int[] sortList) {
        for( int item : sortList){
            System.out.printf("\n Item:%s", item);
        }
    }
}
