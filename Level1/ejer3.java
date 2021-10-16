import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ejer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int a = scan.nextInt();

        scan.close();

        for (int x = 1; x <= a; x++) {
            List<Integer> lista = new ArrayList<Integer>();
            for (int y = 1; y <= x; y++) {
                lista.add(y);
            }
            System.out.println(lista);
        }
    }
}
