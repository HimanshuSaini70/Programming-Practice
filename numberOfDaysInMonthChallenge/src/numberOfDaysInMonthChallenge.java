public class numberOfDaysInMonthChallenge {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2020));
    }


    public static boolean isLeapYear(int Year){
        if ((Year < 1 || Year > 9999)){
            System.out.println("False");
            return false;

        }
        else if (Year%4 == 0 && Year%100 != 0 || Year%400 == 0){
            System.out.println("True");
            return true;

        }
        else
            System.out.println("False");
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if (month<1||month>12){
            return -1;
        }
        else if(year<1&&year>9999){
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;
        }

        switch (month) {
            case 11:
            case 4:
            case 6:
            case 9:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }


    }
}
