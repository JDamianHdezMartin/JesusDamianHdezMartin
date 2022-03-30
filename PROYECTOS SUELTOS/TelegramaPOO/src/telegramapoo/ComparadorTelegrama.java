/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegramapoo;

import java.util.Comparator;

/**
 *
 * @author JDamián
 */
public class ComparadorTelegrama implements Comparator<Telegrama> {
    
    @Override
    public int compare(Telegrama t1, Telegrama t2) {
        return Integer.compare(t1.palabras, t2.palabras);
    }
}
