/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Cuenta {

    String numero;
    String titular;
    double saldo;

    public Cuenta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double Ingresar(double saldo) {
        Scanner sc = new Scanner(System.in);
        double ingresar = sc.nextDouble();
        this.saldo = saldo;
        return saldo + ingresar;
    }

    public double Retirar(double saldo) {
        Scanner sc = new Scanner(System.in);
        double retirar = sc.nextDouble();
        this.saldo = saldo;
        return saldo - retirar;
    }
}
