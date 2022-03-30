/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidopoliticoanexo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author JDamián
 */
class Elecciones {

    private HashMap<String, Partido> partidosMapNombre;
    private TreeSet<Partido> partidosOrdenVotos;

    Partido get(String nombre) {
        return partidosMapNombre.get(nombre);
    }

    Set<Partido> getPartidos() {
        return partidosOrdenVotos;
    }

    int year;
    int escanios;
    String denominacion;

    public Elecciones(String denominacion, int year, int escanios) {
        this.year = year;
        this.denominacion = denominacion;
        this.escanios = escanios;
        partidosMapNombre = new HashMap<String, Partido>();
        partidosOrdenVotos = new TreeSet<Partido>(new Comparator<Partido>() {
            @Override
            public int compare(Partido o1, Partido o2) {
                return o1.votos - o2.votos;
            }
        });
    }}
  