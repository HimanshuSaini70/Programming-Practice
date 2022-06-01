public class switchChallenge {
    public static void main(String[] args) {
        char switchValue = 'F';
        switch (switchValue){
            case 'A':
                System.out.println("it is A");
                break;
            case 'B':
                System.out.println("it is B");
                break;
            case'C': case 'D': case 'E':
                System.out.println("it is C,D or E");
                break;
            default:
                System.out.println("it is not A,B,C,D or E!!");
                break;
        }

    }
}
