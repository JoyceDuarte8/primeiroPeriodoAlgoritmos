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
public class uri1113 {

    public static void main(String[] args) {

        int x, y;

        Scanner leia = new Scanner(System.in);

        do {

            x = leia.nextInt();
            y = leia.nextInt();
            if (x < y) {
                System.out.println("Crescente");
            }
            if (x > y) {
                System.out.println("Decrescente");
            }

        } while (x != y);
    }
}
