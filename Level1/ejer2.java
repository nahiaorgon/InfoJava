/*Realizar un programa que solicite por consola 2 números 
enteros. Para luego imprimir el resultado de la suma, resta, 
multiplicación, división y módulo (resto de la división) 
de ambos números.
*/

import java.util.*;

public class ejer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese dos enteros");

        int a = scan.nextInt();
        int b = scan.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + multi);
        System.out.println("La division de " + a + " y " + b + " es: " + div);
        System.out.println("El modulo de " + a + " y " + b + " es: " + mod);

        scan.close();
    }
}
