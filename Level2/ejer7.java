import java.util.*;

public class ejer7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String> cadNum = new ArrayList<String>();

        int n;
        int m;

        System.out.println("Ingrese limite izquierdo");
        n = scan.nextInt();
        System.out.println("Ingrese limite derecho");
        m = scan.nextInt();

        while (n < m) {
            num.add(n);
            n = n + 1;
        }
        String numCadena;

        for (Integer elemento : num) {
            if ((elemento % 2) == 0) {
                cadNum.add("Fizz");
            } else if ((elemento % 3) == 0) {
                cadNum.add("Buzz");
            } else if (((elemento % 2) == 0) ^ ((elemento % 3) == 0)) {
                cadNum.add("FizzBuzz");
            } else {
                numCadena = String.valueOf(elemento);
                cadNum.add(numCadena);
            }
        }

        Iterator<String> denumaCad = cadNum.iterator();
        System.out.print("[");
        while (denumaCad.hasNext()) {
            String elemento = denumaCad.next();
            System.out.print(elemento + ",");
        }
        System.out.print("]");
        scan.close();
    }
}
