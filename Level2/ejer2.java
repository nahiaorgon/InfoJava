import java.util.*;

public class ejer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>(); // se crea la arrayint n;
        int n;
        do {
            System.out.println("Introduce números enteros. 0 para acabar: ");
            n = scan.nextInt();
            if (n != 0) {
                num.add(n);
            }
        } while (n != 0);

        System.out.println("Cantidad de numero introducidos " + num.size()); // tiene que mostrarme los 5 q ingrese

        System.out.print("Primer lugar ");
        n = scan.nextInt();
        num.add(0, n);

        System.out.print("ultimo lugar ");
        n = scan.nextInt();
        num.add(n);

        System.out.println("Cantidad de numero introducidos " + num.size()); // tiene q mostrar 7

        Iterator<Integer> mostrarr = num.iterator();

        while (mostrarr.hasNext()) {
            Integer elemento = mostrarr.next();
            System.out.println("" + elemento);
        }

        scan.close();
    }
}
