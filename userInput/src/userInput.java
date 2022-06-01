import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            int age = 2020-yearOfBirth;
            scanner.nextLine();//handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age>0&&age<100){
                System.out.println("Your name is " + name +" and your age is "+age);
            }
            else {
                System.out.println("Invalid age range");
            }
        } else {
            System.out.println("Unable to parse year of the birth");
        }


        scanner.close();

    }
}
