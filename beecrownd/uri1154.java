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
public class uri1154 {

    public static void main(String[] args) {

        double i = 0, idade, somaIdades=0;

        double media;
        Scanner leia = new Scanner(System.in);

        
        do { 
            idade = leia.nextDouble();
            
            if (idade>=0){
       
            somaIdades = somaIdades+idade;
            i = i + 1;
            }

        } while (idade >= 0);
        
        media = somaIdades / i;
        System.out.printf("%.2f\n",media);
    }

}
