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
public class uri1157 {

    public static void main(String[] args) {

        int numero;
                Scanner leia = new Scanner(System.in);

        numero = leia.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {
                System.out.println(i);

            }
        }
    }
}
