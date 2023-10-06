import java.util.Arrays;

public class BubbleSort {


    public static void bubbleSort(int[] array) {

        /*
         compare the current index value and the next index value
         if the next index value bigger than the current index value then swap the values

         if there is a swap situation the new value of the next index ( also the current index
         for the next round of for loop ) will already be the biggest value

         the aim is to bring the biggest value to the end

         Time complexity : O(n'')

        * */

        for(int i = array.length ; i > 1;i--) {

            // i = size of the checked array
            // j = index number for checking

            for(int j = 0; j < i - 1 ; j++) {

                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
            System.out.print("Bubble sort was performed on " + (i) +  " values" + " ");
            System.out.println(Arrays.toString(array));

        }

    }

    public static void main(String[] args) {


        // BUBBLE SORT

        int[] array = {2,7,5,3,-6,9,1,4,-5};

        bubbleSort(array);

        System.out.println();
        System.out.println("Sorted array = " + Arrays.toString(array));
    }
}