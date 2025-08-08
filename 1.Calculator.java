import java.util.Scanner;

public class Main {

    public static double calculator(double a, double b, String operation) {

        operation = operation.toLowerCase();

        if (operation.equals("add")) {
            return a + b;
        } else if (operation.equals("sub")) {
            return a - b;
        } else if (operation.equals("mul")) {
            return a * b;
        } else if (operation.equals("div")) {
            if (b == 0) {
                System.out.println("Error: division by zero!");
                return Double.NaN;
            }
            return a / b;
        } else {
            System.out.println("Invalid operation");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); 
        
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.nextLine();

        double result = calculator(a, b, operation);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}
