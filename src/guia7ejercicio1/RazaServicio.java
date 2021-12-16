/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carop
 */
public class RazaServicio {
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.
    private Scanner s = new Scanner(System.in);
    private List<Raza> razas = new ArrayList();

    public RazaServicio() {
    }

    public void mostrarMenu(){
        int opcion;
        boolean aux = true;
        do{
        System.out.println("Ingrese una opción: ");
        System.out.println("1.- Ingresar una nueva raza");
        System.out.println("2.- Salir");
        opcion = s.nextInt();
        
        switch (opcion) {
            case 1:
                crearRaza();
                break;
            case 2:
                mostrarRazas();
                aux = false;
                break;
            default:
                System.out.println("Ingrese una opcion válida");
                break;
        }
        }while(aux);
    }
    
    
    public Raza crearRaza(){
        Raza raza = new Raza();
        System.out.println("Ingrese el nombre de la raza: ");
        raza.setNombre(s.next());
        razas.add(raza);
        return raza;
    }
    
    
    public void mostrarRazas(){
        System.out.println("La lista de razas es: ");
        for (Raza var : razas) {
            System.out.println(var);   
        }
        System.out.println("La cantidad de razas ingresadas en la lista es: " + razas.size());
    }
    
    
}
