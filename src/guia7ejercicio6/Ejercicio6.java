/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author carop
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
//Se necesita una aplicación para una tienda en la cual queremos almacenar los
//distintos productos que venderemos y el precio que tendrán. Además, se necesita
//que la aplicación cuente con las funciones básicas.
//Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.        

        HashMap<String, Float> prod = new HashMap<>();

        boolean ban = true;
        do {
            System.out.println("Ingresar una opción del menú");
            System.out.println("1. Ingresar un producto");
            System.out.println("2. Modificar un producto");
            System.out.println("3.Eliminar un producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");

            switch (leer.nextInt()) {
                case 1:
                    ingresarProducto(prod);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto a modificar");
                    String aux = leer.next();
                    System.out.println("Que atributo del producto desea modificar?: nombre/precio/ambos");
                    switch (leer.next().toLowerCase()) {
                        case "nombre":
                            System.out.println("Ingrese el nuevo nombre");
                            String nom = leer.next();
                            modificarProducto(prod, aux, nom);
                            break;
                        case "precio":
                            System.out.println("Ingrese el nuevo precio");
                            Float pr = leer.nextFloat();
                            modificarProducto(prod, aux, pr);
                            break;
                        case "ambos":
                            System.out.println("Ingrese el nuevo nombre");
                            nom = leer.next();
                            System.out.println("Ingrese el nuevo precio");
                            pr = leer.nextFloat();
                            modificarProducto(prod, aux, nom, pr);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese elnombre del producto a eliminar");
                    String nom = leer.next();
                    eliminarProducto(prod, nom);
                    break;
                case 4:
                    mostrarProductos(prod);
                    break;
                case 5:
                    String aux2;
                    do {
                        System.out.println("Desea Salir: si/no");
                        aux2 = leer.next();
                    } while (!aux2.equalsIgnoreCase("si") && aux2.equalsIgnoreCase("no"));
                    if (aux2.equalsIgnoreCase("si")) {
                        ban = false;
                    }
                    break;
                default:
                    System.out.println("Ingrese nuevamente la opción");
            }
        } while (ban);
    }

    public static void ingresarProducto(HashMap<String, Float> prod) {
        System.out.println("Ingrese nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese el precio del producto");
        Float precio = leer.nextFloat();
        prod.put(nombre, precio);
    }

    public static void modificarProducto(HashMap<String, Float> prod, String nombre, String newNombre) {
        boolean seEncontro = false;
        Float value = 0f;
        for (Map.Entry<String, Float> entry : prod.entrySet()) {
            String key = entry.getKey();
            value = entry.getValue();
            if (key.equalsIgnoreCase(nombre)) {
                seEncontro = true;
            }
        }
        if (seEncontro) {
            prod.remove(nombre);
            prod.put(newNombre, value);
        }
    }

    public static void modificarProducto(HashMap<String, Float> prod, String nombre, Float precio) {
        boolean seEncontro = false;
        String key;
        for (Map.Entry<String, Float> entry : prod.entrySet()) {
            key = entry.getKey();
            Float value = entry.getValue();
            if (key.equalsIgnoreCase(nombre)) {
                seEncontro = true;
            }
        }
        if (seEncontro) {
            prod.remove(nombre);
            prod.put(nombre, precio);
        }
    }

    public static void modificarProducto(HashMap<String, Float> prod, String nombre, String newNombre, Float precio) {
        boolean seEncontro = false;
        String key;
        Float value = 0f;
        for (Map.Entry<String, Float> entry : prod.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (key.equalsIgnoreCase(nombre)) {
                seEncontro = true;
            }
        }
        if (seEncontro) {
            prod.remove(nombre);
            prod.put(newNombre, precio);
        }
    }

    public static void eliminarProducto(HashMap<String, Float> prod, String nombre) {
        int aux = 0;
        for (Map.Entry<String, Float> entry : prod.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            if (key.equalsIgnoreCase(nombre)) {
                prod.remove(key);
                aux = 1;
            }
        }
        if (aux == 0) {
            System.out.println("No tiene un producto con ese nombre");
        }
    }

    public static void mostrarProductos(HashMap<String, Float> prod) {
        for (Map.Entry<String, Float> entry : prod.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println("Producto: " + key + ", Precio: " + value);
        }
    }

}
