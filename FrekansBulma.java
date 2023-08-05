
import java.util.Scanner;
import java.util.Arrays;



public class FrekansBulma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int counter = 1;

        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralı : " + Arrays.toString(list));

        System.out.println("Tekrar Sayıları ");
        int count;
        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            System.out.println(list[i] + " sayısı dizimizde " + count + " adet var.");
            

        }


    }
}
