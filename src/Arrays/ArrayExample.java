package DataStructuresCode.Arrays;

public class ArrayExample {
    public static void main (String[] args)
    {

        int[] arr = new int[5]; // declaration and allocating memory
        arr[0] = 10; //initialization
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++)//Printing the elements of array with index
            System.out.println("Element at index " + i + " : "+ arr[i]);
    }
}
