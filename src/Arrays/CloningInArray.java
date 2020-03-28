package DataStructuresCode.Arrays;

public class CloningInArray {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3};
        int cloneArray[] = intArray.clone(); //.clone() methods will perform a deep copy

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray); // It is false because this will just compare the address or reference not the values of the element.
        System.out.println(intArray); // [I@1b6d3586 address of intArray
        System.out.println(cloneArray); // [I@4554617c address of cloneArray
        /*Since the two address are not similar, the == for array is false*/
        System.out.println(intArray[0] == cloneArray[0]); // This is true because the values are compared.

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }

}
