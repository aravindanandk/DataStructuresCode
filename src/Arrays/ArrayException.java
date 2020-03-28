package DataStructuresCode.Arrays;

public class ArrayException {
    public static void main (String[] args)
    {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;

        for (int i = 0; i <= arr.length; i++) //Loop runs three times but there are only two elements in the array
            System.out.println(arr[i]);
    }
}
