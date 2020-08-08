package GeneralCalc;

import java.util.Scanner;

public class Division {

    public void doDivision(){
        System.out.println("You choose division!");
        System.out.println("Write first number");
        Scanner number = new Scanner(System.in);
        int firstNumber = number.nextInt();

        System.out.println("Write  second number");
        Scanner number2 = new Scanner(System.in);
        int secondNumber = number2.nextInt();

        int result= firstNumber / secondNumber;

        System.out.println(firstNumber + " / " + secondNumber + " = " + result );
    }

}
