/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;

/**
 *
 * @author carop
 */
public class Raza {
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.

    private String nombre;

    public Raza() {
    }

    public Raza(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre;
    }

    
}
