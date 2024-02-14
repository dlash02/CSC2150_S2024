public class Drive_binarySearch {
    public static void main(String[] args) {
        int myList[] = { 2, 3, 4, 6, 8, 10, 14, 16};
        ArraySearch arraySearch = new ArraySearch( myList);
        int searchToken = 14;
        int pos = arraySearch.linearSearch( searchToken );
        System.out.printf("Results;%s", pos);

        int pos2 = arraySearch.binarySearch( searchToken);
        System.out.printf("\nResults2:%s", pos2);

    }
}
