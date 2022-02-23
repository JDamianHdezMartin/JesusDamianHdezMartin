/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;

/**
 *
 * @author JDamián
 */
public class Num {

    String romano;
    int arabigo;

    public Num(String romano, int arabigo) {
        this.romano = romano;
        this.arabigo = arabigo;
    }

    public Num(int arabigo) {
        this.arabigo = arabigo;
    }

    public String toRoman(int arabigo) {
        this.arabigo=arabigo;
        
        int i, miles, centenas, decenas, unidades;
        String romano = "";
               
        miles = arabigo / 1000;
        centenas = arabigo / 100 % 10;
        decenas = arabigo / 10 % 10;
        unidades = arabigo % 10;

        for (i = 1; i <= miles; i++) {
            romano = romano + "M";
        }

        if (centenas == 9) {
            romano = romano + "CM";
        } else if (centenas >= 5) {
            romano = romano + "D";
            for (i = 6; i <= centenas; i++) {
                romano = romano + "C";
            }
        } else if (centenas == 4) {
            romano = romano + "CD";
        } else {
            for (i = 1; i <= centenas; i++) {
                romano = romano + "C";
            }
        }
        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (i = 6; i <= decenas; i++) {
                romano = romano + "X";
            }
        } else if (decenas == 4) {
            romano = romano + "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                romano = romano + "X";
            }

        }
        if (unidades == 9) {
            romano = romano + "IX";
        } else if (unidades >= 5) {
            romano = romano + "V";
            for (i = 6; i <= unidades; i++) {
                romano = romano + "VI";
            }
        } else if (unidades == 4) {
            romano = romano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                romano = romano + "I";
            }
        }
        return romano;
}
}
