package SortWork;

public class BubbleSort {
    public static void main(String[] args) {

//        int arr[] = { 64, 55, 12, 66, 91, 21, 121, 12, 33};
        int arr[] = { 64, 55, 12, 14};
        SortManager sortManager = new SortManager( arr);
        int sLis[] = sortManager.bubbleSort( );
        System.out.printf("\n Results are .... ");
        for ( int item : sLis) {
            System.out.printf("\n Item:%s", item);
        }
    }


}
