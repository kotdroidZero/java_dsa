package array;


///////////////////////////////////////////////////////////////////////////.

// Block Swap Algorithm for Swapping Array

import utility.Utils;

// -----------------------------------------------------------------------
// Initialize A = arr[0..d-1] and B = arr[d..n-1]
//1) Do following until size of A is equal to size of B
//
//  a)  If A is shorter, divide B into Bl and Br such that Br is of same
//       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
//       is at its final place, so recur on pieces of B.
//
//   b)  If A is longer, divide A into Al and Ar such that Al is of same
//       length as B Swap Al and B to change AlArB into BArAl. Now B
//       is at its final place, so recur on pieces of A.
///////////////////////////////////////////////////////////////////////////
public class BlockSwap {

    public static void main(String[] args) {
        int d=1;
        Integer[] arr= new Integer[]{0,3,5,4,7,6,8};

        Utils.printArray(arr);
        System.out.println("After Swapping");
        Utils.printArray(swapArray(arr,0,arr.length-d,d));


    }

    public  static Integer[] divideArray(Integer[] arr, int d){

        int lenA= d;
        int lenB= arr.length-d;


        while(lenA!=lenB){
            //swapArray(arr,)
        }




        return  arr;
    }



    // 2 3 6 7 8
    public static Integer[] swapArray(Integer[] arr, int fi, int si,int d){
        for (int i = 0; i < d; i++) {
            int temp = arr[fi+i];
            arr[fi+i] = arr[si+i];
            arr[si+i]= temp;
        }
        return  arr;
    }
}


