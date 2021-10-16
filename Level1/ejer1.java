import java.util.*;

public class ejer1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //para ingresar valores por pantalla
        System.out.println("Ingrese su nombre de usuario \n");
        String usu = scan.nextLine();

        System.out.println("\nHola " + usu + "\n");
        scan.close();
    }
}