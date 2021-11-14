/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 * Faça um programa que leia 6 valores. Estes valores serão somente negativos ou
 * positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de
 * valores positivos digitados.
 *
 * @author joyce
 */
public class uri1060 {

    public static void main(String[] args) {
       
       
        int quantidadenumerospositivos = 0;

        Scanner leia = new Scanner(System.in);
 

        for (int i = 0; i < 6; i++) {

            int n = leia.nextInt();
            if (n > 0) {
                quantidadenumerospositivos++;
            }
        }
     System.out.println(quantidadenumerospositivos + " valores positivos");
    }
}
