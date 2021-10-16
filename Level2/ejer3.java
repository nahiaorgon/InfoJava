import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ejer3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] cartas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        Arrays.sort(cartas);
        System.out.println("Cartas en orden " + Arrays.toString(cartas));

        Arrays.sort(cartas, Collections.reverseOrder());
        System.out.println("Cartas inversas " + Arrays.toString(cartas));

        for (int i = 0; i < cartas.length; i++) {
            int n = getRandomNumber(0, cartas.length - 1);
            int s = cartas[i];
            cartas[i] = cartas[n];
            cartas[n] = s;
        }

        System.out.println("Cartas desordenadas");
        for (int value : cartas)
            System.out.println("" + value);

        scan.close();
    }

    public static int getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);

    }
}
