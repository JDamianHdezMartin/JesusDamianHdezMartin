/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslambdasstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author carlos
 */


public class EjerciciosLambdasStream {

    /**
     * @param args the command line arguments
     */
    
    static double contador=0;
    
    
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Hombre("Carlo","Fernández", 23, 210, 75));
        personas.add(new Mujer("Marta","Díaz", 25, 205, 55));
        personas.add(new Hombre("Luis","Fernández", 20, 210, 70));
        personas.add(new Mujer("Ana","Díaz", 23, 170, 65));
        personas.add(new Hombre("Armando","San Miguel", 29, 175, 77));   
        personas.add(new Hombre("Ramiro","Sánchez", 32, 200, 72));
        personas.add(new Mujer("Alba","Álvarez", 25, 62, 55));
        personas.add(new Hombre("Marco","Polo", 28, 174, 73));
        personas.add(new Mujer("Mar","Pérez", 23, 161, 58));
        personas.add(new Hombre("Silva","San Miguel", 21, 169, 68));  




//Práctica 40: Mostrar las 3 personas de más edad
    personas.stream()
            
            
//Práctica 41: Mostrar las personas que tienen menos peso que el que le corresponde
//Práctica 42: Mostrar una persona de 27 años si hay alguna
//Práctica 43: Crear un arraylist de hombres con un elemento hombre por cada persona del array original
//Práctica 44: Calcular el peso medio de las mujeres del arraylist
//Práctica 45: Mostrar las personas que tienen más edad que la media
//Práctica 46: Mostrar por cada persona cuántas personas tienen su misma edad
//Práctica 47: Obtener el imc mínimo ( el número ) y mostrar por cada persona su imc
//Práctica 48: Crear un arraylist con las mujeres, y obtener la edad media de los hombres      
//Práctica 49: Crear un arraylist con textos que indiquen por cada persona su nombre, sexo
//y edad: "Ana, mujer: 23años" . Este array quedará ordenado por peso
//Práctica 50: Mostrar la persona adulta más joven ( se entiende por adulto >= 18años)
//Práctica 51: obtener la persona que se aleja más de su peso ideal ( observar que esto puede
//ser tanto por mucho peso como por poco peso )
//Práctica 52: Crear un arraylist con los hombres ordenados de menor a mayor peso al
//principio del array y luego las mujeres con el mismo criterio
//Práctica 53: Mostrar las mujeres que son más altas que los hombres        
//Práctica 54: Obtener un arraylist de String donde cada letra de los diferentes nombres de
//las personas sea un elemento del arraylist. Para esto usaremos flatMap() y la instrucción:
//Arrays.stream(p.nombre.split(""))
//observar que mediante String.split(“”) obtenemos un array de String con todos los
//caracteres separados. Mediante Arrays.stream() convertimos un array en un stream    

  
        

        
    }
    
}
