import java.util.*;

public class ejer8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Nombre y Apellido ");
        String nya = scan.nextLine();

        System.out.println("Ingrese Edad ");
        String edad = scan.nextLine();

        System.out.println("Ingrese Direccion ");
        String dir = scan.nextLine();

        System.out.println("Ingrese Ciudad ");
        String ciudad = scan.nextLine();

        System.out.println("");
        System.out.print(ciudad +" - "+ dir +" - "+edad+" - "+nya);

        scan.close();
    }
}
