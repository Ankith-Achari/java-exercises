import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String[] args){
        System.out.println("**** SIMPLE CALCULATOR ****");
        double num1,num2;
        double result = 0;
        char operator;
        boolean validOperator = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator(+-*/^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+'->result = num1 + num2;
            case '-'->result = num1 - num2;
            case '*'->result = num1 * num2;
            case '/'->{
                if(num2 == 0){
                    System.out.println("Cannot divide by Zero!");
                    validOperator = false;}
                else{
                    result = num1 + num2;}
            }
            case '^'->result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operator");
                scanner.close();
                return;
            }
            }
        if (validOperator){
            System.out.printf("Result: %.2f",result);
        }
        scanner.close();

    }

}

