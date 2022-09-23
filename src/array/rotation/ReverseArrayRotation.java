package array.rotation;


import utility.Utils;

///////////////////////////////////////////////////////////////////////////
//        Reversal algorithm for Array rotation
//        Given an array arr[] of size N, the task is to rotate the array by d position to the left.
//
//
//
//        Example:
//        Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
//        Output: 3, 4, 5, 6, 7, 1, 2
///////////////////////////////////////////////////////////////////////////
public class ReverseArrayRotation {

    public static void main(String[] args) {
        int d = 2;
        Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Integer[] result = rotateArrayInLeft(a,d);

        Utils.printArray(a);
        System.out.println("After rotation of "+ d+" space in left:");
        Utils.printArray(result);
    }


    public static  Integer[] rotateArrayInLeft(Integer[] ar, int d) {

        int len = ar.length;
        Integer[] result = new Integer[len];

        for (int i = 0; i < len; i++) {

            int pos = 0;
            if (i - d < 0) {
                pos = len - d + i;
            } else {
                pos = i - d;
            }
            result[pos] = ar[i];
        }
        return result;
    }
}








