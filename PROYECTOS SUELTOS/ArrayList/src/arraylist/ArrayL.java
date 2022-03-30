/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Random;
import java.util.ArrayList;
        
        
        
/**
 *
 * @author JDamián
 */
public class ArrayL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> al = new ArrayList<>(10);
        for(int i=0;i<10;i++)
        al.add(rnd.nextInt(30));
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));           
        }
            }

        }
