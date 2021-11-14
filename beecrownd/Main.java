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
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int T = leia.nextInt();
        int R1, R2, R3;
        for (int i = 0; i < T; i++) {
            R1 = leitor.nextInt();
            R2 = leitor.nextInt();
            R3 = R1 + R2;
            System.out.println(R3);
        }
    }
}
