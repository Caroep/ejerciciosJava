/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carop
 */
public class Alumno {
//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.
    
    private String nombre; 
    private List<Integer> Lista = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getLista() {
        return Lista;
    }

    public void setLista(List<Integer> Lista) {
        this.Lista = Lista;
    }

    @Override
    public String toString() {
        return "Las notas del alumno: " + nombre + ", Notas={" + Lista + '}';
    }
    
    
}
