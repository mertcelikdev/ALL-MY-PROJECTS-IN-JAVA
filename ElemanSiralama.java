import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç Boyutlu Bir Dizi Gireceksiniz?");
        int boyut = scan.nextInt();
        int[] list = new int[boyut];

        System.out.println("Dizi Elemanlarını Giriniz : ");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". Eleman: ");
            list[i] = scan.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
