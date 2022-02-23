/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidopoliticoanexo;

/**
 *
 * @author JDamián
 */
   class Partido {

        String nombre;
        int votos;
        int diputados;
        String siglas;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getVotos() {
            return votos;
        }

        public void setVotos(int votos) {
            this.votos = votos;
        }

        public int getDiputados() {
            return diputados;
        }

        public void setDiputados(int diputados) {
            this.diputados = diputados;
        }

        public Partido(String nombre, int votos) { //constructor
            this.nombre = nombre;
            this.votos = votos;
            this.siglas = nombre.substring(1, 4);

        }

        @Override
        public String toString() {
            return "{" + nombre + ", votos=" + votos + ", diputados=" + diputados + "} ";
        }
    }
