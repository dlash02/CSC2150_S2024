package Prep;

public  class InsertionSort {
        /*Function to sort array using insertion sort*/
        void insertionsort(int arr[]) {
            int n = arr.length;
            // { 12, 11, 13, 5 };
            // n = 5 (outer) i=1 key=11 r=0 (12 > 11) => { 12, 12, 13, 5}
            //                          r=-1  { 11, 12, 13,5 }
            // outer i=2 key=13 r=1  { 11, 12, 13,5 }
            // outer i=3 key = 5 r=2 (13 > 5)?
            //          ----- { 11, 12, 13, 13}  -> r=1
            //          ------ (12 > 5)?  { 11, 12, 12, 13} -> r = 0
            //          ----- (11 > 5)?    { 11, 11, 12, 13} -> -1
            //      {5, 11, 12, 13}
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int r = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (r >= 0 && arr[r] > key) {
                    arr[r + 1] = arr[r];
                    r = r - 1;
                }
                arr[r + 1] = key;
//                arr[r + 1] = 99;
            }
        }
        /* A utility function to print array of size n*/
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");

            System.out.println();
        }
        // Driver method
        public static void main(String args[]) {
//            int arr[] = { 12, 11, 13, 5, -1 , 7, 90, 60, 50, 30, 54, 2, 1, 6 };
            int arr[] = { 12, 11, 13, 5 };
            //creates new instance of insertin sort and runs it with a given arry
            InsertionSort ob = new InsertionSort();
            ob.insertionsort(arr);
            //prints the sorted array
            printArray(arr);
        }
    }