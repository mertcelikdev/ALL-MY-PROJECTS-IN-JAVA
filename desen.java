import java.util.Scanner;

public class desen {

    static void f(int x) {
        int output = x - 5;
        if (output >= -4) {

            System.out.print(output + " ");
            f(output);

            int temp = output + 5;
            if (temp <= x) {
                System.out.print(temp + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int input = s.nextInt();

        System.out.print(input + " ");
        f(input);
    }
}