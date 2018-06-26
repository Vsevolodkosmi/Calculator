import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try {


            Scanner oper1 = new Scanner(System.in);
            System.out.println("Please enter the first operand: ");
            int operand1 = oper1.nextInt();

            Scanner oper2 = new Scanner(System.in);
            System.out.println("Please enter the second operand: ");
            int operand2 = oper2.nextInt();

            Scanner x = new Scanner(System.in);
            System.out.println("Please take an action: 1)+;  2)*; 3)/*; 4)-; 5)%");
            int sign = x.nextInt();
            if (sign > 0 && sign <= 5)
                switch (sign) {
                    case 1:
                        operand1 = operand1 + operand2;
                        break;
                    case 2:
                        operand1 = operand1 * operand2;
                        break;
                    case 3:
                        if (operand2 > 0)
                            operand1 = operand1 / operand2;
                        else
                            System.out.println("Can`t divide on 0");
                        break;
                    case 4:
                        operand1 = operand1 - operand2;
                        break;
                    case 5:
                        operand1 = operand1 % operand2;
                        break;

                }
            else
                System.out.println("Your choice is wrong!!!");


            System.out.println("Your result is: " + operand1);
        } catch (InputMismatchException o) {
            System.out.println("You should enter a number!");
        }
    }
}


