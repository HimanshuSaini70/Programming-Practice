public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,9));
    }
public static boolean hasSharedDigit(int X,int Y) {
    if ((X < 10 || X > 99) || (Y < 10 || Y > 99)) {
        return false;
    } else {
        int firstDigitofX = X / 10;
        int firstDigitofY = Y / 10;
        int lastDigitofX = X % 10;
        int lastDigitofY = Y % 10;
        if ((firstDigitofX == firstDigitofY) || lastDigitofX == lastDigitofY) {
            return true;
        } else if (lastDigitofX == firstDigitofY || lastDigitofY == firstDigitofX) {
            return true;
        } else {
            return false;
        }
    }
}
}
