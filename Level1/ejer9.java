import java.io.IOException;
import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        char letra;
        String frase;

        System.out.println("Ingrese string");
        frase = scan.nextLine();
        System.out.println("");

        System.out.println("Ingrese Letra para contar");
        letra = (char) System.in.read();
        System.out.println("");

        var cont = 0;
        int i = 0;

        i = frase.indexOf(letra);

        while (i != -1) {
            cont++;
            i = frase.indexOf(letra, i + 1);
        }
        System.out.println("La cantidad es " + cont);

        scan.close();
    }
}