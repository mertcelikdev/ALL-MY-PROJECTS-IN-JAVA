import java.util.Scanner;
// double pow=Math.pow(3,5) = 243


public class uslusayi {

    public static int recursivePow(int a, int b) {
        if (a == 0) {
            return 0;
        }

        if (a != 0 && b == 0) {
            return 1;
        }

        return recursivePow(a, b - 1) * a;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz");
        int n1= input.nextInt();
        System.out.println("Üs olacak sayıyı giriniz");
        int n2= input.nextInt();

        System.out.println("Sonuç : "+ recursivePow(n1,n2));




    }
}
