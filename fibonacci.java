
import java.util.Scanner;

public class fibonacci {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Eleman Sayısını Giriniz");

        int k = input.nextInt();

        int a = 0, b = 1, c = 0;


        for (int i = 0; i < k; i++) {


            System.out.println(c);

            a = b;
            b = c;
            c = a + b;


        }


    }
}
