public class asalsayilar {
    public static void main(String[] args) {

        int i, n , control;
        for (n=2;n<100;n++) {
            control =0;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    control = 1;
                    break;
                }
            }
            if (control==0) {
                System.out.print(n+" ");
            }
        }
    }
}