import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        int number = input.nextInt();
        int total = 0, a = 1;

        for (a = 1; a < number; a++) {
            if (number % a == 0) {
                total = total + a;

            }
        } if (total == number) {
            System.out.println("Seçtiğiniz Sayı Bir Mükemmel Sayıdır");
        }
          else
            System.out.println("Seçtiğiniz Sayı Bir Mükemmel Sayı Değildir");

    }
}
