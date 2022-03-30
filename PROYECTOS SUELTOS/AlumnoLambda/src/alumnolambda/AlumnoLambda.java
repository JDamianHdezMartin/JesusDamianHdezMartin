/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import javafx.util.Pair;

/**
 *
 * @author carlos
 */
public class AlumnoLambda {

    /**
     * @param args the command line arguments
     */
    
    static String nombres[]={ "Ana", "María", "Alfredo", "Martín", "Diego", "Rita", "Américo", "Marta"};
    static String apellidos[]={"González", "García", "Pérez", "Rodríguez", "Expósito", "Hernández" };   
    
    
    public static Profesor crearProfesor(){
        String departamentos[] = {"Psicología", "Medicina", "Biología", "Farmacia"};
        Random rnd= new Random();
        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];

        int edad = rnd.nextInt(80) + 10;
        int altura = rnd.nextInt(40) + 150;
        int peso = rnd.nextInt(40) + 50;
        double salario = rnd.nextInt(1000) + 1800;
        String departamento = departamentos[rnd.nextInt(departamentos.length)];
        Profesor prof = new Profesor(nombre, apellido, edad, altura, peso,departamento,salario); 
        return prof;     
        
    }
    
    
    public static Alumno crearAlumno(){
        Random rnd= new Random();
        String nombre = nombres[rnd.nextInt(nombres.length)];
        String apellido = apellidos[rnd.nextInt(apellidos.length)];

        int edad = rnd.nextInt(80) + 10;
        int altura = rnd.nextInt(40) + 150;
        int peso = rnd.nextInt(40) + 50;
        Alumno alu = new Alumno(nombre, apellido, edad, altura, peso); 
        
        int numeroAsignaturas = rnd.nextInt(Alumno.Asignatura.values().length/2) + Alumno.Asignatura.values().length/2;
        for (int j = 0; j < numeroAsignaturas; j++) {
            int intAsignatura = rnd.nextInt(Alumno.Asignatura.values().length);
            Alumno.Asignatura asignatura = Alumno.Asignatura.values()[intAsignatura];
            int nota = rnd.nextInt(11);
            alu.agregarCalificacion(asignatura, nota);
        }        
        
        return alu;
        
    }
    
    public static void main(String[] args) {

        ArrayList<Persona> array = new ArrayList<Persona>();
        Random rnd= new Random();
        
        
        for (int i = 0; i < 20; i++) {
            int probabilidadCrearProfesor = rnd.nextInt(10);
            Persona p = null;
            if( probabilidadCrearProfesor < 3){  // 3 de 10: aproximadamente el 30% de las veces se creará un profesor
                p=crearProfesor();
            }else{
                p=crearAlumno();
            }
            array.add(p);
            
        }
        
        array.stream()
                .forEach(System.out::println);
        
        
        
        
        //1) Mostrar el salario más alto de los profesores
        System.out.println("\n\nEl salario más alto entre los profesores es:");
        array.stream()
                .filter(persona-> persona instanceof Profesor)
                .map(persona->(Profesor)persona)
                .max((Profesor p1, Profesor p2)-> (int)(p1.salario - p2.salario))
                .ifPresent(profesor-> System.out.println(profesor.salario));
        
        
        
        
        //2) Mostrar el salario medio de los profesores
        System.out.println("\n\nEl salario medio de los profesores:");
        array.stream()
                .filter(persona-> persona instanceof Profesor)
                .map(persona->(Profesor)persona)
                .mapToDouble(p->p.salario)
                .average()
                .ifPresent(System.out::println);
        
        
        
        
        //3) Mostrar cuál es la máxima cantidad de asignaturas de las que hay
        //matriculado un alumno ( contar las asignaturas que tiene cada alumno y mostrar la cantidad máxima entre esas )
        System.out.println("\n\nLa cantidad máxima de asignaturas matriculadas por un alumno es: ");
        array.stream()
                .filter(persona-> persona instanceof Alumno)
                .map(p->(Alumno)p)
                .mapToInt(p->p.calificaciones.size())
                .max()
                .ifPresent(System.out::println);
                
        
        
        //4) mostrar nombre, apellido altura y peso para las personas que tienen 
        //sobrepeso ( imc >= 25 ) Sabiendo que la fórmula de imc es:
        //   peso / altura^2     Donde peso está en kg y altura en m
        
        System.out.println("\n\nlas personas con sobrepeso son: ");
        array.stream()
                .filter(p->p.pesoEnKg/(Math.pow(p.alturaEnCm/(double)100,2)) >= 25)
                .forEach(p->{
                    System.out.println(p.nombre + " " + p.apellido1 + " " + p.alturaEnCm+"cm " + p.pesoEnKg + "kg");
                });
        
        
        
        
        //5) mostrar las dos alturas distintas más bajas
        System.out.println("\n\nLas dos alturas distintas más bajas:");
        array.stream()
                .mapToInt(p->p.alturaEnCm)
                .distinct()
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        
        
        //6) Decir: hay profesores en el array si se encuentran profesores 
        // no se puede usar for ni bucles habituales y únicamente un método de stream ( no pueden usarse varios )
        // máximo 3 líneas de código( es inválido varias sentencias en una única línea:  int a; a=3; a++;  )
        
        if ( array.stream().anyMatch(p->p instanceof Profesor) ){
            System.out.println("\n\nHay profesores en el array");
        }
                
        
        
        
        // 6.1 Obtener un ArrayList con las personas llamadas Ana
        System.out.println("\n\n Las personas llamadas Ana:");
        ArrayList<Persona> anas = (ArrayList<Persona>)array.stream()
                .filter(p->p.nombre.equals("Ana"))
                .collect(Collectors.toList());
        System.out.println(anas);
        
        
        
        //7) mostrar en mayúsculas los diferentes departamentos que aparecen en el arraylist 
        //ordenados alfabéticamente
        System.out.println("\n\nDepartamentos en orden alfabético");
        array.stream()
                .filter(p->p instanceof Profesor)
                .map(p->(Profesor)p)
                .map(p->p.departamento.toUpperCase())
                .distinct()
                .sorted()
                .forEach(System.out::println);
        
        
        
        
        
        // 8) obtenener y mostrar la cantidad de profesores por cada departamento
        // no se deben mostrar los departamentos que no tienen ningún profesor
        System.out.println("\n\n");
        array.stream()
                .filter(p->p instanceof Profesor)
                .map(p->((Profesor)p).departamento)
                .distinct()
                .forEach(departamento->{
                    double suma=0;
                    System.out.println("Departamento: " + departamento);
                    
                    double cantidad = array.stream()
                            .filter(p->p instanceof Profesor)
                            .map(p->(Profesor)p)
                            .filter(p->p.departamento.equals(departamento))
                            .count();
                    System.out.println("cantidad: " + cantidad);
                });
        
        
        // 9) obtener el porcentaje de profesores del array ( 100* cantidad profesores / tamaño del array   )
        System.out.println("\n\nEl porcentaje de profesores en el array es:");
        long cantidadProfesores = array.stream()
                .filter(p->p instanceof Profesor)
                .count();
        System.out.println(100*(cantidadProfesores/(double)array.size()));
                
        
        
        
        // 10) mostrar los nombres completos de  los alumnos cuyo nombre de pila comience por: "A" y su calificación en LND 
        //( en el caso que la tengan en otro caso escribir: no tiene LND )
        System.out.println("\n\nAlumnos con LND que su nombre empieza por A\n");
        array.stream()
                .filter(persona->persona instanceof Alumno)
                .filter(persona-> persona.nombre.toUpperCase().charAt(0) == 'A')
                .map(persona->(Alumno)persona)
                .forEach( alumno->{
                    System.out.print(alumno.nombre + " " + alumno.apellido1 + " ");
                    int nota = alumno.calificaciones.stream()
                            .filter(calif->calif.asignatura == Alumno.Asignatura.LND)
                            .map(calif -> calif.nota)
                            .findFirst()

                            .orElse(new Integer(-1));
                    if(nota == -1){
                        System.out.println("no tiene LND");
                    }else{
                        System.out.println(nota);
                    }
                            
                            
                
                });
        
        
        
        
        
        //11) para cada asignatura localizar las notas más altas y mostrar el nombre de a qué alumnos corresponde esa nota ( observar que 
        //puede haber varios alumnos con la máxima nota en una misma asignatura ) 
        System.out.println("\n\nLos alumnos con mejor nota en cada módulo: ");
        Arrays.asList(Alumno.Asignatura.values()).stream()
                .forEach(asignatura-> {
                            Pair<String,Alumno.Calificacion> alumnoNota =
                            array.stream()
                                .filter(persona-> persona instanceof Alumno) // tomamos únicamente lo alumnos del array
                                .map(persona->(Alumno)persona) //hacemos que el stream sea de Alumno
                                .filter(alumno->alumno.calificaciones.stream().anyMatch(calificacion->calificacion.asignatura==asignatura))
                                .map(
                                        alumno->new Pair<String,Alumno.Calificacion>(alumno.nombre + " " + alumno.apellido1,
                                                alumno.calificaciones.stream()
                                                        .filter(calificacion->calificacion.asignatura==asignatura)
                                                        .findFirst()
                                                        .get()
                                        )
                                )
                                .max( Comparator.comparing( par->par.getValue().nota))
                                .get();
                            System.out.println(alumnoNota);
                        }
                            
                        
                
                );
        // 12. Mostrar la media de todas las notas ( se toman las notas de todos los alumnos
                // y se obtiene la media )
                double notaMediaGlobal = array.stream()
                        .filter( p -> p instanceof Alumno)
                        .map(p->(Alumno)p)
                        .flatMap(alu-> alu.calificaciones.stream())
                        .mapToDouble(cal->cal.nota)
                        .average()
                        .getAsDouble();
                
    }  
}
