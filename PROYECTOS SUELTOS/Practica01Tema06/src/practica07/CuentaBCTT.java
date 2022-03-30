/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

/**
 *
 * @author alumno
 */
public class CuentaBCTT extends Cuenta {

    public CuentaBCTT(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double Retirar(double saldo) {
        //hay un error a la hora de calcular la comisión, debería calcularse sobre lo retirado
        double comision = 0.02 * super.Retirar(saldo);
        return super.Retirar(saldo) - comision;
    }

    @Override
    public double Ingresar(double saldo) {
        //hay un error similar al que hay en retirar
        return super.Ingresar(saldo) - 0.50;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
