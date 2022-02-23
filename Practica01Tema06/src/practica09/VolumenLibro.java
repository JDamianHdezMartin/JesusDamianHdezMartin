/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09;

/**
 *
 * @author alumno
 */
public class VolumenLibro extends Libro{
    String propietario;
    enum EstadoConservacion{bueno, regular, malo };
    int id;
    boolean variosTomos;

    public VolumenLibro(String propietario, int id, String[] autor, String titulo, String resumen, int paginas) {
        super(autor, titulo, resumen, paginas);
        this.propietario = propietario;
        this.id = id;
        variosTomos = libroGrande();
    }

    @Override
    public String toString() {
        return "VolumenLibro{" + "propietario=" + propietario + ", id=" + id + '}';
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getAutor() {
        return autor;
    }

    public void setAutor(String[] autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
}
