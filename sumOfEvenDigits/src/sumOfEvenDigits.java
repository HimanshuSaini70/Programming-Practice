public class sumOfEvenDigits {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(124));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        //125 -->125/10 = 12*10 = 120 --> 125-120 =5
        while (number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            //condition for digit to be even than only add the sum
            if (digit % 2 == 0) {
                sum += digit;
            }

            //dropping the least significant digit
           number = number / 10;

        }
        return sum;
    }
}