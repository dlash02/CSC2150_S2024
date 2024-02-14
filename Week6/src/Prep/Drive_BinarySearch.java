package Prep;

public class Drive_BinarySearch  {
    public static void main(String[] args) {

        int myList[] = { 2, 3, 4, 10, 40 };
        ArraySearch aSearch = new ArraySearch(myList);
        int needle = 10;
        int res = aSearch.linearSearch( needle );
        showResult( needle, res );

        int result = aSearch.binarySearch( needle );
        showResult( needle, result );

    }

    private static void showResult(int item, int res) {
        if (res == -1)
            System.out.printf("\n Item:%s not present", item);
        else
            System.out.printf("\nItem:%s found at index:%s",
                    item, res);
    }
}
