/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

/**
 *
 * @author joyce
 */
public class uri1158 {

   public static void main(String[] args) {
        int casos, i, x, y, soma = 0, cont=0;

        java.util.Scanner leia = new java.util.Scanner(System.in);

        casos = leia.nextInt();
        for (i = 0; i < casos; i++) {
            cont=0;
            soma=0;
            x = leia.nextInt();
            y = leia.nextInt();

            while (cont<y){
             
                    
                if (x % 2 != 0) {    
                    soma += x;
                    cont++;
                }
                x++;
            }
        
            System.out.println(soma);

        }
    }

}
