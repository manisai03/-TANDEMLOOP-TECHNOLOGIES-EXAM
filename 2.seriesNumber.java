import java.util.*;

public class Main {

    
    public static void seriesNumber(int m, int[] result) {
        for (int i = 0; i < m; i++) {
            result[i] = 2 * i + 1; 
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number(a): ");
        int a =sc.nextInt();
        int[] result = new int[m];

        seriesNumber(m, result);

    
        for (int i = 0; i < m; i++) {
            System.out.print(result[i]);
            if (i < am- 1) {
                System.out.print(", ");
            }
        }
    }
}
