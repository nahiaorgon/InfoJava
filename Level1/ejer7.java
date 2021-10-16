import java.util.*;

public class ejer7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese String en minuscula a convertir en Mayuscula ");
        String palabra = scan.nextLine();
        String cont = "";
        char letra;

        for (var i = 0; i < palabra.length(); i++) {
            switch (palabra.charAt(i)) {
                case 'a':
                    if (palabra.charAt(i) == 'a') {
                        letra = 'A';
                        cont = cont + letra;
                    }
                case 'b':
                    if (palabra.charAt(i) == 'b') {
                        letra = 'B';
                        cont = cont + letra;
                    }
                case 'c':
                    if (palabra.charAt(i) == 'c') {
                        letra = 'C';
                        cont = cont + letra;
                    }
                case 'd':
                    if (palabra.charAt(i) == 'd') {
                        letra = 'D';
                        cont = cont + letra;
                    }
                case 'e':
                    if (palabra.charAt(i) == 'e') {
                        letra = 'E';
                        cont = cont + letra;
                    }
                case 'f':
                    if (palabra.charAt(i) == 'f') {
                        letra = 'F';
                        cont = cont + letra;
                    }
                case 'g':
                    if (palabra.charAt(i) == 'g') {
                        letra = 'G';
                        cont = cont + letra;
                    }
                case 'h':
                    if (palabra.charAt(i) == 'h') {
                        letra = 'H';
                        cont = cont + letra;
                    }
                case 'i':
                    if (palabra.charAt(i) == 'i') {
                        letra = 'I';
                        cont = cont + letra;
                    }
                case 'j':
                    if (palabra.charAt(i) == 'j') {
                        letra = 'J';
                        cont = cont + letra;
                    }
                case 'k':
                    if (palabra.charAt(i) == 'k') {
                        letra = 'K';
                        cont = cont + letra;
                    }
                case 'l':
                    if (palabra.charAt(i) == 'l') {
                        letra = 'L';
                        cont = cont + letra;
                    }
                case 'm':
                    if (palabra.charAt(i) == 'm') {
                        letra = 'M';
                        cont = cont + letra;
                    }
                case 'n':
                    if (palabra.charAt(i) == 'n') {
                        letra = 'N';
                        cont = cont + letra;
                    }
                case 'o':
                    if (palabra.charAt(i) == 'o') {
                        letra = 'O';
                        cont = cont + letra;
                    }
                case 'p':
                    if (palabra.charAt(i) == 'p') {
                        letra = 'P';
                        cont = cont + letra;
                    }
                case 'q':
                    if (palabra.charAt(i) == 'q') {
                        letra = 'Q';
                        cont = cont + letra;
                    }
                case 'r':
                    if (palabra.charAt(i) == 'r') {
                        letra = 'R';
                        cont = cont + letra;
                    }
                case 's':
                    if (palabra.charAt(i) == 's') {
                        letra = 'S';
                        cont = cont + letra;
                    }
                case 't':
                    if (palabra.charAt(i) == 't') {
                        letra = 'T';
                        cont = cont + letra;
                    }
                case 'u':
                    if (palabra.charAt(i) == 'u') {
                        letra = 'U';
                        cont = cont + letra;
                    }
                case 'v':
                    if (palabra.charAt(i) == 'v') {
                        letra = 'V';
                        cont = cont + letra;
                    }
                case 'w':
                    if (palabra.charAt(i) == 'w') {
                        letra = 'W';
                        cont = cont + letra;
                    }
                case 'x':
                    if (palabra.charAt(i) == 'x') {
                        letra = 'X';
                        cont = cont + letra;
                    }
                case 'y':
                    if (palabra.charAt(i) == 'y') {
                        letra = 'Y';
                        cont = cont + letra;
                    }
                case 'z':
                    if (palabra.charAt(i) == 'z') {
                        letra = 'Z';
                        cont = cont + letra;
                    }
            }
        }
        System.out.println("La palabra convertida a mayúscula es " + cont);
        scan.close();
    }
}