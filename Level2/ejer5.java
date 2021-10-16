import java.util.*;

public class ejer5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> horastrab = new ArrayList<Integer>();
        ArrayList<Integer> valorhora = new ArrayList<Integer>();

        int n;
        int s;
        int cont = 0;
        do {
            System.out.println("Introduce las horas trabajadas. ");
            n = scan.nextInt();
            System.out.println("Introduce el valor por hora. ");
            s = scan.nextInt();
            if (cont < 5) {
                horastrab.add(n);
                valorhora.add(s);
                cont = cont + 1;
            }
        } while (cont < 5);

        int multi = 0;
        int total = 0;
        int contador = 0;
        int i = 0;

        while (contador < 5) {
            total = horastrab.get(i) * valorhora.get(i);
            multi = multi + total;
            contador = contador + 1;
            i = i + 1;
        }
        System.out.println("Total Final: $" + multi + "\n");

        scan.close();
    }
}