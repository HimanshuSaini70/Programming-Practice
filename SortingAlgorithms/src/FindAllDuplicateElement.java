import java.util.*;

public class FindAllDuplicateElement {


    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
            //finding all the missing duplicates
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                    ans.add(index + 1);
                }
            }
return ans;
        }


    }

