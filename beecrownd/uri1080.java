/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 *Leia 100 valores inteiros. Apresente então o maior valor lido e a 
 * posição dentre os 100 valores lidos.
 * @author joyce
 */
public class uri1080 {
    
    public static void main (String []args){
        
        int numeros, maiorValor = 0,i, posicao = 0;
        
     
        for (i=1;i>100; i++) {
            
            Scanner leia= new Scanner (System.in);   
            numeros=leia.nextInt() ;
            
            if (numeros>maiorValor){
                maiorValor=numeros;
                posicao=i;
            }
        }
        System.out.println(maiorValor);
        System.out.println(posicao);
    }
    
}
