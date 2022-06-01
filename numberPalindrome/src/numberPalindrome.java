public class numberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int number) {
        if (number<0){
            number=number*-1;
        }
        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            int lastDigit = stored % 10;
            reverse = (reverse * 10)+ lastDigit;

            stored=stored/10;

        }
        if (reverse==number){
            return true;
        }
        else
            return false;
    }
}
