/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author JDamián
 */
public class Libro {
    String libro;
    String editorial;
    int anio;
    enum tipoLibro{novela, teatro, poesía, ensayo}

    public Libro(String libro, String editorial, int anio) {
        this.libro = libro;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
