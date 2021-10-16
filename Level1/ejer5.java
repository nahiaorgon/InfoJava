//Se desea una aplicación que solicite 2 números enteros y 
//realice la operación de multiplicación por sumas sucesivas

import java.util.*;

public class ejer5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros para realizar las sumas sucesivas");
        int a = scan.nextInt();
        int b = scan.nextInt();
        var cont = b;
        var n = 0;
        while(cont!=0){
            cont=cont-1;
            n=n+a;
        }
        System.out.println(+n);
        scan.close();
    }
}
