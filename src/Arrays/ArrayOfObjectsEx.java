package DataStructuresCode.Arrays;

public class ArrayOfObjectsEx {
    public static void main (String[] args)
    {
        Student[] arr= new Student[2];// declaration and allocating memory
        arr[0] = new Student(1,"Aravind");
        arr[1] = new Student(2,"Ashwin");

        for (int i = 0; i < arr.length; i++) //Printing the elements of array with index
            System.out.println("Element at " + i + " : " + arr[i].name +" "+ arr[i].rollNo);
    }
}

