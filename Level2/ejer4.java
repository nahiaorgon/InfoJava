import java.util.*;

public class ejer4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList <String> nombres = new ArrayList <String>();
        nombres.add("Nahiara");
        nombres.add("Valentina");
        nombres.add("Mariano");
        nombres.add("Lucas");
        nombres.add("Franco");
        nombres.add("Maxi");
        nombres.add("Mica");
        nombres.add("Chiara");
        nombres.add("Cecilia");
        nombres.add("Leia");
        nombres.add("Gustavo");
        nombres.add("Alejandro");

        List<String> primero = nombres.subList(0, 4);
        List<String> segundo = nombres.subList(4, 8);
        List<String> tercero = nombres.subList(8, 12);

        System.out.println("Los nombres del primer grupo son: "+primero+"\n");

        System.out.println("Los nombres del segundo grupo son: "+segundo+"\n");

        System.out.println("Los nombres del tercer grupo son: "+tercero+"\n");

        scan.close();
    }
}
