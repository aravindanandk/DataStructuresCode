package DataStructuresCode.Arrays;

public class ArraysToMethods {

    public static void sum(int[] arr) //Method accepting a array
    {
        // Calculating the sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i]; //adding each value of the array to sum.
        System.out.println("sum of array values : " + sum);
    }

    public static void main(String args[])
    {
        int arr[] = {9, 1, 2, 5, 4};
        // passing array to method sum
        sum(arr);

    }
}
