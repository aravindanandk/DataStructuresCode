package DataStructuresCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        /*Different declaration of Array*/
        int[] numbers1 = {1,2,3,4,5,6};
        int[] numbers2 = {7,8,9,10,11,12};
        String[] aArray = new String[5]; // Just declared not initiated
        String[] bArray = {"a","b","c", "d", "e"};
        String[] cArray = new String[]{"a","b","c","d","e"};
        /*Methods used in Java Array*/
        /*1.Printing an Array using toString*/
        System.out.println(numbers1); // Address - [I@1b6d3586 will be printed
        String arrayOutput = Arrays.toString(numbers1); //java.util.Arrays will be used/imported
        System.out.println(arrayOutput); // The element of arrays is printed with []

        /*2.Creating ArrayList from Array using .asList*/
        System.out.println(bArray); // Address - [Ljava.lang.String;@4554617c will be printed
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(bArray)); //java.util.ArrayList will be imported
        System.out.println(arrayList);
        // even toString works here to print the String array elements
        String stringOutput = Arrays.toString(bArray);
        System.out.println(stringOutput);

        /*3.Check if a value is present in an Array using .contains method which returns a boolean value
        * Note this can be used on List*/
        boolean check = Arrays.asList(bArray).contains("a");
        System.out.println(check);

        /*4.Concatenate arrays using System.arraycopy methods*/
        int lengthA= numbers1.length;
        int lengthB= numbers2.length;
        int conLength = lengthA+lengthB;
        int[] concatenatedArray = new int[conLength];
        //System.arraycopy (source, index position of source, destination, index position of destination, Length of source)
        System.arraycopy(numbers1,0,concatenatedArray,0,lengthA);
        System.arraycopy(numbers2,0,concatenatedArray,lengthA,lengthB);
        String concatenateOutput = Arrays.toString(concatenatedArray);
        System.out.println(concatenateOutput);

        /*5.Sorting Array and Searching in the array*/
        int intArr[] = { 10, 20, 15, 22, 35 };
        String sortedArray = Arrays.toString(intArr);
        System.out.println("Unsorted Array: " + sortedArray);
        Arrays.sort(intArr);
        sortedArray = Arrays.toString(intArr);
        System.out.println("Sorted Array: " + sortedArray);
        int intKey = 15;
        //binarySearch(array, value_to_be_searched) -> returns the index value of the searched element in the array
        System.out.println(intKey + " found at index " + Arrays.binarySearch(intArr, intKey));
    }
}


