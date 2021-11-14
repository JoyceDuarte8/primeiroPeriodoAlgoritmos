/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 *
 * @author joyce
 */
public class uri1066 {
    public static void main (String []agrs){
        
        int n, impares=0, pares=0, negativos=0, positivos=0;
        
        Scanner leia =new Scanner(System.in);
    

        
     for (int i=0;i<5;i++ ){

          n=leia.nextInt();
            if (i % 2 != 0) {
                impares = impares + 1;
            }
            
            if (i%2==0){
                pares=pares+1;
            }
            if (i>0){
                
                positivos=positivos+1;
            }
            if (i<0){
                
                negativos=negativos+1;
            }


     }
        
System.out. println(pares+" valor(es) par(es)");
System.out. println(impares+" valor(es) impar(es)");
System.out. println(positivos+" valor(es) positivo(s)");
System.out. println(negativos+ "valor(es) negativo(s)");
                                
    }
    
}
