/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carop
 */
public class PeliculaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Pelicula> peliculas;

    public PeliculaServicio() {
        peliculas = new ArrayList<>();
    }

    private void llenarListaDePeliculas() {
        Pelicula peli = new Pelicula();
        System.out.println("Ingresar datos de Pelicula");
        System.out.print("Titulo: ");
        peli.setTitulo(leer.next());
        System.out.print("Director: ");
        peli.setDirector(leer.next());
        System.out.print("Duración: ");
        peli.setDuracion(leer.nextInt());
        peliculas.add(peli);
    }

    public void menuPeliculas() {
        boolean aux = true;
        do {
            System.out.println("Bienvenido al menú principal");
            System.out.println("1. Ingrese nueva pelicula a la lista");
            System.out.println("2. Mostrar Lista de peliculas");
            System.out.println("3. Mostrar Lista de peliculas con duración mayor a una hora");
            System.out.println("4. Mostrar Lista de peliculas ordenada de mayor a menor duración");
            System.out.println("5. Mostrar Lista de peliculas ordenada de menor a mayor duración");
            System.out.println("6. Mostrar Lista de peliculas ordenadas según título");
            System.out.println("7. Mostrar Lista de peliculas ordenada según director");
            System.out.println("8. Salir");

            switch (leer.nextInt()) {
                case 1:
                    llenarListaDePeliculas();
                    break;
                case 2:
                    mostrarListaDePelicula();
                    break;
                case 3:
                    mostrarPeliculasConDuracionMasDeUnaHora();
                    break;
                case 4:
                    peliculas.sort(PeliculaServicio.PeliculaComparators.ordenarPorDuracionMayorAMenor);
                    break;
                case 5:
                    peliculas.sort(PeliculaServicio.PeliculaComparators.ordenarPorDuracionMenorAMayor);
                    break;
                case 6:
                    peliculas.sort(PeliculaServicio.PeliculaComparators.ordenarPorTitulo);
                    break;
                case 7:
                    peliculas.sort(PeliculaServicio.PeliculaComparators.ordenarPorDirector);
                    break;
                case 8:
                    aux = false;
                    break;
                default:
                    System.out.println("Ingrese nuevamente la opción");
                    break;
            }
        } while (aux);
    }
//• Mostrar en pantalla todas las películas.

    private void mostrarListaDePelicula() {
        for (Pelicula peli : peliculas) {
            System.out.println(peli.toString());
        }
    }
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.   

    private void mostrarPeliculasConDuracionMasDeUnaHora() {
        List<Pelicula> ListaAux = new ArrayList<>();
        for (Pelicula peli : peliculas) {
            if (peli.getDuracion() > 1) {
                ListaAux.add(peli);
            }
        }
        for (Pelicula peli : ListaAux) {
            System.out.println(peli.toString());
        }
    }

    public static class PeliculaComparators {
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.

        public static Comparator<Pelicula> ordenarPorDuracionMayorAMenor = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return (-1) * t.getDuracion().compareTo(t1.getDuracion());
            }
        };
        public static Comparator<Pelicula> ordenarPorDuracionLambda = (t1, t2) -> t1.getDuracion().compareTo(t2.getDuracion());
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
        public static Comparator<Pelicula> ordenarPorDuracionMenorAMayor = (t1, t2) -> t1.getDuracion().compareTo(t2.getDuracion());

//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
        public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getTitulo().compareTo(t1.getTitulo());
            }
        };

//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return (-1) * t.getDirector().compareTo(t1.getDirector());
            }
        };
    }
}
