import java.util.Scanner;

public class tersyildiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:     ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = n; j > (n - i); j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}