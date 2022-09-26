package array.searching;

import utility.Utils;

/**
 * Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.
 * <p>
 * Note: Find the element in O(logN) time and assume that all the elements are distinct.
 * <p>
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
 * Output : Found at index 8
 */


// 1,2,3,4,8,
// d=2 L
// 3,4,8,1,2
// d=2 R
// 4,8,1,2,3
public class SearchElementInSortedRotatedArray {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 4, 5, 6, 20};

        Utils.printArray(sortArray(arr));

        int key = 3;
        int index = findElementIndex(key, arr);
        System.out.println(key + " found at index number : " + index);

    }


    /**
     * Binary Search
     **/
    public static int findElementIndex(int element, Integer[] arr) {

        int index = -1;
        boolean found = false;

        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midIndex = 0;
        while (!found) {
            System.out.println("In Loop");
            midIndex = (startIndex + endIndex) / 2;
            if (endIndex - startIndex == 1) {
                break;
            } else if (element > arr[midIndex]) {
                startIndex = midIndex;
            } else if (element < arr[midIndex]) {
                endIndex = midIndex;
            } else {
                index = midIndex;
                found = true;
            }
        }

        return index;
    }


    /**
     * Selection Sort
     */
    public static Integer[] sortArray(Integer[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}


