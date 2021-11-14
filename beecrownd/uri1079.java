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
public class uri1079 {
    
    public static void main (String[]args){
      
        Scanner leia= new Scanner (System.in);
        
        int quantidadeCasos= leia.nextInt();
        int i;
       
        
        for (i= 1; i<=quantidadeCasos;i++){
            
        float n1=leia.nextFloat();
        float n2=leia.nextFloat();
        float n3=leia.nextFloat();
        
        float mediaPonderada= (n1*2+n2*3+n3*5)/(2+3+5);
      
        System.out.printf("%.1f\n", mediaPonderada);
      
        }
        
    }
    
}
