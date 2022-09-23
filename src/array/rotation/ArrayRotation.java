package array.rotation;


import utility.Utils;

/*Program to rotate array by given number of step

        Input:
        arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
        Output: 3 4 5 6 7 1 2

        Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
        Output: 5 6 7 1 2 3 4*/
public class ArrayRotation {


    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,5,6,8};
        int displacement = 3;
        Integer[] result = rotateArray(array,displacement);

        Utils.printArray(array);
        System.out.println("After rotation of "+ displacement+" space");
        Utils.printArray(result);
    }


    public  static  Integer[] rotateArray(Integer[] array, int displacement){
        int len = array.length;
        Integer[] result = new Integer[len];
        for(int i=0;i<array.length;i++){
                if(i+displacement>=len){
                    result[i+displacement-len]=array[i];
                }else{
                     result[i+displacement]=array[i];
                }
        }
        return  result;
    }
}



// other approaches
// 1.
/* Rotate one by one
Let us take arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2.

        First Step:
        => Rotate to left by one position.
        => arr[] = {2, 3, 4, 5, 6, 7, 1}

        Second Step:
        => Rotate again to left by one position
        => arr[] = {3, 4, 5, 6, 7, 1, 2}

        Rotation is done by 2 times.
        So the array becomes arr[] = {3, 4, 5, 6, 7, 1, 2}*/

//2. Using Temp Array
/*Suppose the give array is arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2.

        First Step:
        => Store the elements from 2nd index to the last.
        => temp[] = [3, 4, 5, 6, 7]

        Second Step:
        => Now store the first 2 elements into the temp[] array.
        => temp[] = [3, 4, 5, 6, 7, 1, 2]

        Third Steps:
        => Copy the elements of the temp[] array into the original array.
        => arr[] = temp[] So arr[] = [3, 4, 5, 6, 7, 1, 2]*/
