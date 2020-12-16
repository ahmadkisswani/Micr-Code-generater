/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code.generater;

import java.util.Random;

/**
 *
 * @author User1
 */
public class CodeGenerater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int _8 = 0,_2 = 0,_5 = 0,_10 = 0;
        
        Random rnd = new Random();

        for (int i = 0; i < 1000; i++) {
            
            for (int j = 0; j < 100; j++) {
         
                               _8 = 10000000 + rnd.nextInt(90000000);
_2 = 10 + rnd.nextInt(9);
_5= 10000 + rnd.nextInt(90000);
_10 = 100000000 + rnd.nextInt(900000000);
            
                
          

  }
          //  System.out.println("a"+_8+"  "+"c"+_2+"a"+_5+"e"+"  " +_10+i+"c");
             System.out.println(_8+""+_2+""+""+_5+""+_10);
            
            System.out.println("");
          
        }
        
        
    }
    
}
