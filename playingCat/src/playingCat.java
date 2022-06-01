public class playingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35));
    }
    public static boolean isCatPlaying(boolean summer ,int temperature){
        if(summer==true && (temperature<46 &&temperature>24)){
            return true;
        }
        else if (summer==false&&(temperature<36&&temperature>24)){
            return true;
        }
        else
            return false;
    }
}
