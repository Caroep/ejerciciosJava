/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carop
 */
public class PerroServicio {

    private Scanner s = new Scanner(System.in);
    private List<Perro> perros = new ArrayList();

    public PerroServicio() {
    }

    public void mostrarMenu() {
        int opcion;
        boolean aux = true;
        do {
            System.out.println("Ingrese una opción: ");
            System.out.println("1.- Ingresar un nueva perro");
            System.out.println("2.- Mostrar lista y luego eliminar un elemento");
            System.out.println("3.- Salir");

            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    crearPerro();
                    break;
                case 2:
                    mostrarPerros();
                    System.out.println("Ingrese el perro que desea eliminar de la lista");
                    EliminarPerro(s.next());
                    mostrarPerros();
                    System.out.println(" ");
                    break;
                case 3:
                    mostrarPerros();
                    aux = false;
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
                    break;
            }
        } while (aux);
    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre de la raza: ");
        perro.setNombre(s.next());
        perros.add(perro);
        return perro;
    }

    public void EliminarPerro(String nombre) {
        Iterator<Perro> iterator = perros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNombre().equals(nombre)) {
            iterator.remove();
            }
        }
    }

    public void mostrarPerros() {
        System.out.println("La lista de razas es: ");
        for (Perro var : perros) {
            System.out.println(var);
        }
        System.out.println("La cantidad de razas ingresadas en la lista es: " + perros.size());
    }

}
