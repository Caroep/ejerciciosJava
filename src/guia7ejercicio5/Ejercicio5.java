/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author carop
 */
public class Ejercicio5 {

    static Scanner Leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen
//repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
//guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
//guardados en el conjunto.
//Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//recordar como se ordena un conjunto.
//Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
//se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
//ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
//se le informará al usuario.      
        Set<Pais> Paises = new HashSet();
        String opc;
        do {
            Pais pais = new Pais();
            System.out.println("Ingrese un país");
            pais.setNombre(Leer.next());
            Paises.add(pais);
            do{
                System.out.println("Desea Ingresar otro país: si/no? ");
                opc = Leer.next().toLowerCase();
            }while(!opc.equals("si") && !opc.equals("no"));
        } while (opc.equals("si"));
        
        for (Pais pais : Paises) {
            System.out.println(pais.toString());
        }   
        System.out.println("\n");
        
        System.out.println("Conjunto ordenado alfabeticamente");
        List<Pais> ListaPais = new ArrayList<>(Paises);
        ListaPais.sort(Ejercicio5.PaisComparator.ordenarAlfabeticamete);
        
        System.out.println("Conjunto de paises ingresados");
        for (Pais pais : ListaPais) {
            System.out.println(pais.toString());
        }   
        System.out.println("\n");
        
        Iterator<Pais> it = Paises.iterator();
        String p;
        int cont = 0;
        System.out.println("Ingrese el nombre del País que desea eliminar");
        p = Leer.next();
        while(it.hasNext()){
            if(it.next().getNombre().equals(p)){
                it.remove();
                cont = 1;
            }
        }
        if(cont == 1){
            System.out.println("Se Elimino el País"); 
            System.out.println("El nuevo conjunto es:");
            for (Pais pais : Paises) {
            System.out.println(pais.toString());
            }
        }
        else
            System.out.println("No se encontró el país en el conjunto");
    }
    
    public static class PaisComparator {
        
        public static Comparator<Pais> ordenarAlfabeticamete = new Comparator<Pais> (){
            @Override 
            public int compare(Pais p, Pais p1) {
                return p.getNombre().compareTo(p1.getNombre());
            }
        };
    
}
}
