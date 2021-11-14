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
public class uri1096 {

    public static void main(String[] args) {
        int cont, i = 1;

        for (i = 1; i < 10; i++) {
            int j = 8;
            for (cont = 1; cont <= 3; cont = cont + 1) {

                if (i % 2 != 0) {
                    i = i;
                    j = j - 1;
                    System.out.println("I=" + i + " J=" + j);
                }

            }
        }
    }

}
