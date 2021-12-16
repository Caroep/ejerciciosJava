/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio5;

import java.util.Objects;

/**
 *
 * @author carop
 */
public class Pais {
 private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pais){
            Pais p = (Pais) obj;
            return this.nombre.equals(((Pais) obj).nombre);
        }
        else 
            return false;
    }
            
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Pais other = (Pais) obj;
//        if (!Objects.equals(this.nombre, other.nombre)) {
//            return false;
//        }
//        return true;
//    }

    
    @Override
    public String toString() {
        return "Pais{" + nombre + '}';
    }
 
}
