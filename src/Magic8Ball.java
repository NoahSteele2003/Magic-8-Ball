import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String question;
        int value;

        System.out.println("What is your question?");
        question = keyboard.nextLine();
        System.out.println("Pick a number between 1 and 100.");
        value = keyboard.nextInt();

        if (value >= 1 && value<=10){ System.out.println("yes");}



    }
}
