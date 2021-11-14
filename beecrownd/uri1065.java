/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 *1065) Faça um programa que leia 5 valores inteiros. Conte quantos destes 
 * valores digitados são pares e mostre esta informação.
 * @author joyce
 */
public class uri1065 {
    
    public static void main(String[] args) {

        int quantidadenumerospares = 0;

        Scanner leia = new Scanner(System.in);
 

        for (int i = 0; i < 5; i++) {

            int n = leia.nextInt();
            
            if (n>0 && n%2==0){
                
                quantidadenumerospares++;
            }
        }
     System.out.println(quantidadenumerospares + " valores positivos");
    }
}