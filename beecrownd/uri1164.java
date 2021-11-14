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
public class uri1164 {

    public static void main(String[] args) {

        int numero;
        Scanner leia = new Scanner(System.in);
        int numeroCasos = leia.nextInt();

        for (int j = 0; j < numeroCasos; j++) {
            numero = leia.nextInt();

         

                int soma = 0;
                for (int i = 1; i < numero; i++) {

                    if (numero % i == 0) {

                        int divisivel = i;
                        soma += divisivel;

                    }

                }

                if (soma == numero) {
                    System.out.println(numero + " eh perfeito");
                } else {
                    System.out.println(numero + " nao eh perfeito");
                }

            }

        }
}
