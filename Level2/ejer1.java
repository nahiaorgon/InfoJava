//Crear un ArrayList y cargarlo con tus ciudades 
//favoritas de Argentina, luego imprimir por pantalla el ranking

import java.util.*;

public class ejer1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        ArrayList <String> ciudades = new ArrayList <String>(); //se crea la array

        ciudades.add("Corrientes");
        ciudades.add("Cordoba");
        ciudades.add("Bariloche");

        Iterator<String> mostrarr = ciudades.iterator();
        int n=1;
        while(mostrarr.hasNext()){
            String elemento = mostrarr.next();
            System.out.println("#"+n + " " + "-"+ " "+elemento);
            n=n+1;
        }
         
        scan.close();
    }
}
