//factorial de un numero - n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.

import java.util.*;

public class ejer4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero para su factorial");

        int a = scan.nextInt();

        System.out.println("El factorial es " + Fact(a));
        scan.close();
    }

    public static int Fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = n * Fact(n - 1);
        }
        return factorial;
    }
}