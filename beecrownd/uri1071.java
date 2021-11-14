/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 *
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números
 * impares entre eles. O programa deve imprimir um valor inteiro. Este valor é a
 * soma dos valores ímpares que estão entre os valores fornecidos na entrada que
 * deverá caber em um inteiro.
 *
 * @author joyce
 */
public class uri1071 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int x= leia.nextInt();
        int y = leia.nextInt();

        int somaImpares = 0;

        for (int i = y+1; i < x; i++) {

            if (i % 2 != 0) {

                somaImpares = somaImpares + i;
            }
        }

        System.out.println(somaImpares);
    }
}
