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
public class uri1153 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n, i, fatorial = 1;

        n = leia.nextInt();

        if (n > 0 && n < 13) {

            for (i = n; i > 0; i--) {
                fatorial *= i;
               
            }
        } System.out.println(fatorial);

    }
}
