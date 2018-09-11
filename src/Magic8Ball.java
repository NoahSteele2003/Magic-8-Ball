import sun.awt.SunToolkit;
import sun.java2d.pipe.LoopBasedPipe;

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

        if (value>=0 && value<=10){System.out.println("yes");}
        else if (value>10 && value<=20){System.out.println("No");}
        else if (value>20 && value<=30){System.out.println("The future looks promising");}
        else if (value>30 && value<=40){System.out.println("All signs point to no");}
        else if (value>40 && value<=50){System.out.println("It is guaranteed");}
        else if (value>50 && value<=60){System.out.println("It is impossible");}
        else if (value>60 && value<=70){System.out.println("Definitely yes");}
        else if (value>70 && value<=80){System.out.println("It will never happen");}
        else if (value>80 && value<=90){System.out.println("For sure!");}
        else if (value>90 && value<=100){System.out.println("Definitely not");}





    }
}
