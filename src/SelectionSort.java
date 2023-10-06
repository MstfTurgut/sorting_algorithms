import java.util.Arrays;

public class SelectionSort {


    public static void selectionSort(int[] array) {

        /*
        *  check for the minimum number on array
        *
        *  swap the first element on array with this minimum number
        *
        *  the aim is to bring the minimum number to start
        *
        *  Time complexity : O(n'')
        *
        * */

        for(int i = 0 ; i < array.length - 1 ;i++) {

            // i = index number to start from

            int minNumber = array[i];
            int minNumIndex = i;

            // j = checked index
            for(int j = i ; j < array.length ; j++) {

                if(array[j] < minNumber) {
                    minNumber = array[j];
                    minNumIndex = j;
                }

            }
            
            array[minNumIndex] = array[i];
            array[i] = minNumber;

            System.out.print("Selection sort was performed on " + (array.length - i) + " values" + " ");
            System.out.println(Arrays.toString(array));

        }



    }

    public static void main(String[] args) {

        // SELECTION SORT

        int[] array = {2,7,5,3,-6,9,1,4,-5};

        selectionSort(array);

        System.out.println();
        System.out.println("Sorted array = " + Arrays.toString(array));


    }




}
