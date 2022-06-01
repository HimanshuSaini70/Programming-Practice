public class secondandMinutechalllenge {


    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3944));
    }
    public static String  getDurationString (int minutes , int second){
        if(minutes<0 || (second<0) || (second>59)) {
            return "invalid vale";

        }
        int hours = minutes/60;
         int remaningminutes = minutes%60;


       return hours+" h "+remaningminutes+" m "+ second +" s";

    }
    public static String getDurationString(int seconds){
        if (seconds<0){
            return "invalid value";
        }
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        return getDurationString(minutes,remainingSeconds);
    }
}
