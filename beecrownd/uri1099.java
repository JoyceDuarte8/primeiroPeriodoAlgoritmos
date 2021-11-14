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
public class uri1099 {

    public static void main(String[] args) {
        int casos, i, x, y, j,soma=0;

        Scanner leia = new Scanner(System.in);
        
        casos = leia.nextInt();
        for (i = 1; i <= casos; i++) {
       
            x = leia.nextInt();
            y = leia.nextInt();

            if (x > y) {
                
               for( i= x-1 ;i>y;i--){
                if (i%2!=2){
                    soma+=i;
                }
            }

            } else if (y<x){
                for (j= y-1;j>x;j--){
                    if (j%2!=0){
                        soma+=j;
                    }
                }
            }

            System.out.println(soma);

        }
    }
}
