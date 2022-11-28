
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Please choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Please enter your first number");
        number1 = input.nextDouble();

        System.out.println("Please enter your second number");
        number2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Sorry you have chosen incorrect operator. Please choose +, -, *, or /");
                break;
        }

        input.close();
    }
}

