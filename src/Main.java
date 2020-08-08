import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Write first number");
        Scanner number = new Scanner(System.in);
        int firstNumber = number.nextInt();

        System.out.println("Write second number");
        Scanner number2 = new Scanner(System.in);
        int secondNumber = number2.nextInt();
        int a= firstNumber + secondNumber;


        System.out.println(a);
    }
}
