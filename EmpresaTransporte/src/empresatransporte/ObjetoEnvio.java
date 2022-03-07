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

    @Override
    public boolean esTransportable() {
        //falta arreglar este desastre de if...
        if (!anchoPaquete = 1.5),(!profundidadPaquete= 1.0),(!altoPaquete=1.2){
            return false;
        }else(){
        return true;
        
    }
}}
