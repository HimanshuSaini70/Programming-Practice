public class perfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));

    }
    public static boolean isPerfectNumber(int number){

        int sum=0;
        for (int i=1;i<number;i++ ){
        if (number%i==0){
            sum+=i;

        }

        }
        if (sum==number&&number>1)
            return true;


        else
            return false;
    }
}
