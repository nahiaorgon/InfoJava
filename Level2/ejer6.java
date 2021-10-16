import java.util.*;
import java.util.Scanner;

public class ejer6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> nomyap = new HashSet<String>();
        Set<Integer> dni = new HashSet<Integer>();
        ArrayList<Integer> horastrab = new ArrayList<Integer>();
        ArrayList<Integer> valorhora = new ArrayList<Integer>();

        nomyap.add("Nahiara");
        nomyap.add("Chiara");
        nomyap.add("Mariano");
        nomyap.add("Valen");
        nomyap.add("Gaston");
        nomyap.add("Alejandro");
        nomyap.add("Mica");

        dni.add(11);
        dni.add(12);
        dni.add(13);
        dni.add(14);
        dni.add(15);
        dni.add(16);
        dni.add(17);

        horastrab.add(8);
        horastrab.add(9);
        horastrab.add(6);
        horastrab.add(5);
        horastrab.add(8);
        horastrab.add(4);
        horastrab.add(3);

        valorhora.add(120);
        valorhora.add(150);
        valorhora.add(85);
        valorhora.add(300);
        valorhora.add(600);
        valorhora.add(50);
        valorhora.add(905);

        int sueldo = 0;

        Map<Integer, Integer> mapa1 = new HashMap<Integer, Integer>();

        System.out.println("Ingrese dni para imprimir su sueldo");
        Integer n = scan.nextInt();

        scan.close();

        if (compareTo(n, mapa1.get(dni))) {
            System.out.println("Dni no existe");
        } else {
            switch (n) {
                case 11:
                    sueldo = horastrab.get(0) * valorhora.get(0);
                    mapa1.put(n, sueldo);
                    System.out.println("El dni es " + n + " y el sueldo es " + sueldo);
                case 12:
                    sueldo = horastrab.get(1) * valorhora.get(1);
                    mapa1.put(n, sueldo);
                    System.out.println("El dni es " + n + " y el sueldo es " + sueldo);
                case 13:
                    sueldo = horastrab.get(2) * valorhora.get(2);
                    mapa1.put(n, sueldo);
                    System.out.println("El dni es " + n + " y el sueldo es " + sueldo);
                case 14:
                    sueldo = horastrab.get(3) * valorhora.get(3);
                    mapa1.put(n, sueldo);
                    System.out.println("El dni es " + n + " y el sueldo es " + sueldo);
                case 15:
                    sueldo = horastrab.get(4) * valorhora.get(4);
                    mapa1.put(n, sueldo);
                    System.out.println("El dni es " + n + " y el sueldo es " + sueldo);
                case 16:
                    sueldo = horastrab.get(5) * valorhora.get(5);
                    mapa1.put(n, sueldo);
                    System.out.println("El dni es " + n + " y el sueldo es " + sueldo);
                case 17:
                    sueldo = horastrab.get(6) * valorhora.get(6);
                    mapa1.put(n, sueldo);
                    System.out.println("El dni es " + n + " y el sueldo es " + sueldo);
            }

        }

    }

    private static boolean compareTo(Integer n, Integer integer) {
        return false;
    }
}
