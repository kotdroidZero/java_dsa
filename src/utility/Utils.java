package utility;

public class Utils {
    public  static void printArray(Object[] array){
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if(i== len-1){
                System.out.println(array[i]);
            }else{
                System.out.print(array[i]+" ,");
            }
        }
    }
}
