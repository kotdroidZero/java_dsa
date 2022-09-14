package array;

public class ArrayRotation {


    public static void main(String[] args) {
        int[] array = new int[]{1,2,5,6,8};

        int[] result = rotateArray(array,4);


        for (int k : array) {
            System.out.print(k + " , ");
        }
        System.out.println();
        System.out.println("After rotation of 2 space");
        for (int j : result) {
            System.out.print(j + " , ");
        }
    }


    public  static  int[] rotateArray(int[] array, int displacement){

        int len = array.length;
        int[] result = new int[len];


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
