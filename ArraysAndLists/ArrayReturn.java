package ArraysAndLists;
class ArrayReturn {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5};
        sum(a);
        int arr[] = m1();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
////////////////////////////////////////////////////////////////////
    int intArray[] = {1,2,3};
    int cloneArray[] = intArray.clone();
    System.out.println(intArray + " " + cloneArray);
    
    int intArray1[][] = {{1,2,3},{4,5}};
          
    int cloneArray1[][] = intArray1.clone();
          
        // will print false
    System.out.println(intArray1 == cloneArray1);
          
        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
    System.out.println(intArray1[0] == cloneArray1[0]);
    System.out.println(intArray1[1] == cloneArray1[1]);
////////////////////////////////////////////////////////////////////
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
            sum += arr[i];
        System.out.println("Sum of array values: " + sum);
    }
    
    public static int[] m1() {
        return new int[]{1, 2, 3};
    }


}