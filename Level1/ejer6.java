import java.util.*;

public class ejer6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = scan.nextInt();

        System.out.println("Ingrese el segundo numero");
        int b = scan.nextInt();

        var cont = 0;
        cont = b;
        var n = 1;
        while (cont != 0) {
            cont = cont - 1;
            n = n * a;
        }
        System.out.println(+n);

        scan.close();
    }
}
