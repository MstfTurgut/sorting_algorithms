import java.util.Arrays;

public class InsertionSort {


    public static void insertionSort(int[] array) {


        /*
        *
        * take the numbers from start except the first element
        *
        * check the numbers one by one to the left of the target number
        *
        * if the number from left is bigger than the target number swap the values
        *
        * Time complexity : O(n'')
        *
        * */


        for(int i = 1 ; i < array.length;i++) {

            // i = target number index

            int targetNumber = array[i];

            System.out.print("Numbers from the left checking for the number " + array[i] + " ");
            System.out.println(Arrays.toString(array));

            // j = numbers to the left

            for(int j = i - 1 ; j >= 0; j--) {

                if(array[j] > targetNumber ) {

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                } else  {
                    break;
                }

            }


        }

    }


    public static void main(String[] args) {

        // INSERTION SORT

        int[] array = {2,7,5,3,-6,9,1,4,-5};

        insertionSort(array);

        System.out.println();
        System.out.println("Sorted array = " + Arrays.toString(array));

    }






}
