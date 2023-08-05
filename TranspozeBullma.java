public class TranspozeBullma {


    public static void main(String[] args) {
        // 2x3 boyutunda bir matris
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Transpoz matrisi için yeni bir 3x2 matris oluşturuyoruz
        int[][] transpozMatris = new int[matris[0].length][matris.length];

        // Matrisin transpozunu hesaplıyoruz
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Transpoz matrisini ekrana yazdırıyoruz
        for (int i = 0; i < transpozMatris.length; i++) {
            for (int j = 0; j < transpozMatris[0].length; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}




