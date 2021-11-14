/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
 * positivos. Na próxima linha, deve-se mostrar a média de todos os valores
 * positivos digitados, com um dígito após o ponto decimal.
 *
 * @author joyce
 */
public class uri1064 {

    public static void main(String[] args) {
        Scanner leia= new Scanner (System.in);
        double valor,soma = 0,media;
        int cont, qp;
        qp=0;
        
        for (cont=0;cont<6;cont=cont+1){
            valor=leia.nextDouble();
            if (valor >0){
                qp = qp+1;
                soma = soma + valor;
            }
        }
        media= soma/qp;
        System.out.println(qp+" valores positivos");
        System.out.printf("%.1f\n",media);
    }

}
