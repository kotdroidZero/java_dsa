package array.rotation;


import utility.Utils;

import javax.rmi.CORBA.Util;

///////////////////////////////////////////////////////////////////////////
// So the sequence of operations is:
//
//Reverse the whole array
//Then reverse the last ‘d’ elements and
//Then reverse the first (N-d) elements.
///////////////////////////////////////////////////////////////////////////
public class ReversalAlgorithm {
    public static void main(String[] args) {

        int d = 2;
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        Utils.printArray(arr);
        Integer[] arr1 = reverseArrayV3(arr, 0, arr.length - 1);
        Utils.printArray(arr1);
        Integer[] arr2 = reverseArrayV3(arr1, 0, arr1.length - d - 1);
        Utils.printArray(arr2);
        Integer[] arr3 = reverseArrayV3(arr2, arr2.length - d, arr2.length - 1);
        Utils.printArray(arr3);


    }


    static Integer[] reverseArray(Integer[] arr) {

        //1, 2, 3, 4, 5, 6, 7
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int indexToReplace = len - i - 1;
            if (i == indexToReplace || i > indexToReplace) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[indexToReplace];
            arr[indexToReplace] = temp;
        }
        return arr;
    }


    static Integer[] reverseArrayV2(Integer[] arr, int fi, int si) {

        //1, 2, 3, 4, 5, 6, 7

        int len = si - fi;
        for (int i = fi; i < si; i++) {
            int indexToReplace = len - i;
            if (i == indexToReplace || i > indexToReplace) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[indexToReplace];
            arr[indexToReplace] = temp;
        }
        return arr;
    }

    static Integer[] reverseArrayV4(Integer[] arr, int fi, int si) {


        for (int i = 0; i < si; i++) {


            fi = fi + i;
            si = si - i;

            int temp = arr[si];
            arr[si] = arr[fi];
            arr[fi] = temp;



            if (si >= fi) {
                break;
            }


        }
        return arr;
    }

    static Integer[] reverseArrayV3(Integer[] arr,int fi , int si){

            int i = fi;
            int j = si;
            int temp = 0;
            while(i != j && i< arr.length -1){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i= i+1;
                j = j-1;

            }
        return arr;
    }
}
