public class MissingNumber {
    public void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public int missingNumber(int[] arr) {
        // int n = nums.length;
        //int MaxSum = (n*(n+1))/2;

        //int CurSum =0;
        //for(int i=0;i<nums.length;i++){
        //  CurSum+=nums[i];
        //}
        //return MaxSum-CurSum;
        int i=0;
        while (i< arr.length){
            int correct = arr[i];
            if (arr[i]<arr.length &&arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(index!=arr[index]){
                return index;
            }
        }
        return arr.length;

    }
}
