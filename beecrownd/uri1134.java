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
public class uri1134 {
     public static void main(String[] args) {
        
      int numero, alcool=0, gasolina=0,disel=0;
        
        Scanner leia = new Scanner(System.in);
      
       
        do {
             numero=leia.nextInt();
          switch (numero) {
              case 1:
                  alcool=alcool+1;
                  break;
              case 2:
                  gasolina=gasolina+1;
                  break;
              case 3:
                  disel=disel+1;
                  break;
              default:
                  break;
          }
            
        }   
        while ((numero!=4));
       System.out.println("MUITO OBRIGADO");
       System.out.println("Alcool: "+alcool);
       System.out.println("Gasolina: "+gasolina);
       System.out.println("Disel: "+disel);
    }
      
}
