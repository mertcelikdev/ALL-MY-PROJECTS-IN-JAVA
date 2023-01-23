package Arrays;

public class HarmonicCalculator {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {

            sum += 1 / numbers[i];
        }
        System.out.println(numbers.length / sum);


    }
}
