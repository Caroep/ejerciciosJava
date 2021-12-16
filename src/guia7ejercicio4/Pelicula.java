/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4;

/**
 *
 * @author carop
 */
public class Pelicula {
//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
//esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
//horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
//cuenta lo que se pide a continuación:
 
private String titulo;
private String director;
private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    


}
