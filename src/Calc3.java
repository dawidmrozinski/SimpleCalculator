import java.util.Scanner;

public class Calc3 {

    public static void main(String[] args) {
        System.out.println("What do you want to do?");
        System.out.println("Choose number: 1- addition, 2- subtraction");

        Scanner operation = new Scanner(System.in);
        int chooseOperation = operation.nextInt();

        if (chooseOperation == 1){
            System.out.println("Write first number");
            Scanner number = new Scanner(System.in);
            int firstNumber = number.nextInt();

            System.out.println("Write second number");
            Scanner number2 = new Scanner(System.in);
            int secondNumber = number2.nextInt();

            int result = firstNumber + secondNumber;
            System.out.println("Your result: " + result);
        }
        if (chooseOperation == 2){
            System.out.println("Write first number");
            Scanner number = new Scanner(System.in);
            int firstNumber = number.nextInt();

            System.out.println("Write second number");
            Scanner number2 = new Scanner(System.in);
            int secondNumber = number2.nextInt();

            int result = firstNumber - secondNumber;

            System.out.println("Your result: " + result);
        }
        if (chooseOperation > 2)
            System.out.println("Error - choose number: 1- addition or 2- subtraction");
    }
}
