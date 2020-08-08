package GeneralCalc;

import java.util.Scanner;

public class ChhoseOperation {

    protected void chooseOperation(){
        Subtiction s = new Subtiction();
        Addition a = new Addition();
        Multiplication m = new Multiplication();
        Division d = new Division();
        System.out.println("Choose what do you want to do: 1- addition , 2- subtiction, 3- multiplication, 4- division, 5- Close aplication");

        Scanner operation = new Scanner(System.in);
        int chooseOperation = operation.nextInt();


        if (chooseOperation == 1) {
            a.doAddition();
            System.out.println("Do you want to try again? 1- yes, 2- no");
            Scanner tryAgain = new Scanner(System.in);
            int chooser = tryAgain.nextInt();
            if (chooser == 1){
                chooseOperation();
            }
            if (chooser == 2){
                System.out.println("Ok! Bye!");
            }
            if (chooser > 2){
                System.out.println("Error! Try again!");
                chooseOperation();
            }
        }
        if (chooseOperation == 2) {
            s.doSubtiction();

            System.out.println("Do you want to try again? 1- yes, 2- no");
            Scanner tryAgain = new Scanner(System.in);
            int chooser = tryAgain.nextInt();
            if (chooser == 1){
                chooseOperation();
            }
            if (chooser == 2){
                System.out.println("Ok! Bye!");
            }
            if (chooser > 2){
                System.out.println("Error! Try again!");
                chooseOperation();
            }
        }
        if (chooseOperation == 3) {
            m.doMultiplication();

            System.out.println("Do you want to try again? 1- yes, 2- no");
            Scanner tryAgain = new Scanner(System.in);
            int chooser = tryAgain.nextInt();
            if (chooser == 1){
                chooseOperation();
            }
            if (chooser == 2){
                System.out.println("Ok! Bye!");
            }
            if (chooser > 2){
                System.out.println("Error! Try again!");
                chooseOperation();
            }
        }
        if (chooseOperation == 4) {
            d.doDivision();
            System.out.println("Do you want to try again? 1- yes, 2- no");

            Scanner tryAgain = new Scanner(System.in);
            int chooser = tryAgain.nextInt();
            if (chooser == 1){
                chooseOperation();
            }
            if (chooser == 2){
                System.out.println("Ok! Bye!");
            }
            if (chooser > 2){
                System.out.println("Error! Try again!");
                chooseOperation();
            }
        }
        if (chooseOperation == 5){
            System.out.println("Ok! See you later");
        }

        if (chooseOperation > 5){

            System.out.println("Error you chose wrong number! Choose: 1- addition , 2- subtiction, 3- multiplication, 4- division, 5- Close Operation");
            chooseOperation();
        }
    }

}
