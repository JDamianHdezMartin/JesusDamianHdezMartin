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
public class Libro {
    String [] autor;
    String titulo;
    String resumen;
    int paginas;

    public Libro(String[] autor, String titulo, String resumen, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.resumen = resumen;
        this.paginas = paginas;
    }
    public boolean libroGrande(){
        if (paginas>=500) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", resumen=" + resumen + ", paginas=" + paginas + '}';
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
