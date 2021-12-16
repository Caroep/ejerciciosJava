/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carop
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bluce tendremos el siguiente método en la clase Alumno:    
        String aux = "si";
        String nom;
        List<Alumno> AlumnoList = new ArrayList();
        do {
            AlumnoList.add(crearAlumno());
            do {
                System.out.println("Desea ingresar un nuevo alumno?: si/no");
                aux = sc.next();
                aux.toLowerCase();
            } while (!aux.equals("si") && !aux.equals("no"));

            //}
        } while (aux.equals("si"));
        
        System.out.println("Ingrese el alumno del cual desea saber su promedio");    
        nom = sc.next();
        if(notaFinal(nom, AlumnoList) != 0)
        System.out.println("El promedio del alumno: " + nom + "es: " + notaFinal(nom, AlumnoList));
        else
            System.out.println("No existe el alumno en la lista");

    }

    public static Alumno crearAlumno() {
        Alumno alumno = new Alumno();
        System.out.println("Ingresar los datos del alumno");
        System.out.print("Nombre completo: ");
        alumno.setNombre(sc.next());
        System.out.println("Ingrese las tres notas correspondiente al alumno ingresado");
        System.out.print("Nota1:");
        alumno.getLista().add(sc.nextInt());
        System.out.print("Nota2:");
        alumno.getLista().add(sc.nextInt());
        System.out.print("Nota3:");
        alumno.getLista().add(sc.nextInt());
        return alumno;
    }
    //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
//nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//Siendo este promedio final, devuelto por el método y mostrado en el main.    
    
    public static double notaFinal(String nombre, List<Alumno> lista){
        double promedio = 0;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getNombre().equals(nombre)){
                promedio = (lista.get(i).getLista().get(0) + lista.get(i).getLista().get(1) + lista.get(i).getLista().get(2)) / 3;
            }
        }
    return promedio;
    }
}
