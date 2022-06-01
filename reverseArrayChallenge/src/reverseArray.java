import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
    int[] Array = new int[] {1,2,3,4,5,6};
        System.out.println("the  intial Array is = "+ Arrays.toString(Array)  );
        reverse(Array);

        System.out.println("Reversed Array is  = "+ Arrays.toString(Array));
    }

    private static void reverse(int[] array){
        int temp;
        for (int i=0,j = array.length-1;  i<j;i++,j--){
            temp = array[i];
            array[i]= array[j];
            array[j]= temp;

        }
    }
}
