/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04;

/**
 *
 * @author JDamián
 */
public class Practica18 {

    
    class DNI{
    int dninum;
    
    
    public static boolean validarDNI(String strDNI){
        boolean dniOK=true;
        String strNumero = strDNI.substring(0, strDNI.length() - 1);
        int num = -1;
        try{
            num = Integer.parseInt( strNumero);
            char letra = calcularLetra(num);
            if( letra == strDNI.charAt(strDNI.length() -1 )){
                dniOK = true;
            }else{
                dniOK = false;
            }
        }catch(Exception ex){ dniOK = false; }
        
        return dniOK;
    }
    
    public DNI(int numero){
        dninum = numero;
    }
    
    @Override
    public String toString(){
        return "" + dninum + calcularLetra(dninum);
    }
  
    
    private static char calcularLetra(int numero){
        int posicion = numero % letrasPosibles.length();
        return letrasPosibles.charAt(posicion);
    }
    
    public int getDninum() {
        return dninum;
    }

    public void setDninum(int dninum) {
        this.dninum = dninum;
    }
    private static final String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
