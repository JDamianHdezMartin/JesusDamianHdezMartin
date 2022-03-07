/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

/**
 *
 * @author alumno
 */
public class ObjetoEnvio implements Empaquetable {
    int idPaquete;
    double anchoPaquete = 1.5;
    double profundidadPaquete = 1.0;
    double altoPaquete = 1.2;

    public ObjetoEnvio(int idPaquete, double anchoPaquete, double profundidadPaquete, double altoPaquete) {
        this.idPaquete = idPaquete;
        this.anchoPaquete = anchoPaquete;
        this.profundidadPaquete = profundidadPaquete;
        this.altoPaquete = altoPaquete;
    }   

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public double getAnchoPaquete() {
        return anchoPaquete;
    }

    public void setAnchoPaquete(double anchoPaquete) {
        this.anchoPaquete = anchoPaquete;
    }

    public double getProfundidadPaquete() {
        return profundidadPaquete;
    }

    public void setProfundidadPaquete(double profundidadPaquete) {
        this.profundidadPaquete = profundidadPaquete;
    }

    public double getAltoPaquete() {
        return altoPaquete;
    }

    public void setAltoPaquete(double altoPaquete) {
        this.altoPaquete = altoPaquete;
    }
    
    
    
    @Override
    public boolean esTransportable() {
        if (anchoPaquete > 1.5){
            System.out.println("El paquete es demasiado ancho");
            return false;
        }else{
            if (altoPaquete> 1.2) {
                System.out.println("El paquete es demasiado alto");
                return false;
            }else{
                if (profundidadPaquete>1.0) {
                    System.out.println("El paquete es demasiado largo");
                    return false;
                }else{
                    return true;
                }
            }
    }
}}
