import java.util.Scanner;

public class Main {
    public static void series(int a) {
    
        if (a % 2 == 0) {
            a = a - 1;
        }

        
        for (int i = 0; i < a; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        series(a);

        scanner.close();
    }
}
