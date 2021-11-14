/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
 * ser validada separadamente. Saída: Se uma nota inválida for lida, deve ser
 * impressa a mensagem "nota invalida". Quando duas notas válidas forem lidas,
 * deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor
 * deve ser apresentado com duas casas após o ponto decimal.
 *
 * @author joyce
 */
public class uri1117 {
    
    public static void main(String[] args) {
        
        float media;
        
        Scanner leia = new Scanner(System.in);
        float notaAnterior, notaAtual = -1;
       
        do {
            notaAnterior=notaAtual;
            
            
            notaAtual=leia.nextFloat();
            
            if  ((notaAnterior<0.0||notaAnterior>10.0)|| (notaAtual<0.0||notaAtual>10.0)){
                System.out.println("nota invalida");
            }
            
            
            
        }   
        while ((notaAnterior<0.0||notaAnterior>10.0)|| (notaAtual<0.0||notaAtual>10.0));
        
        media=(notaAnterior+notaAtual)/2;
        System.out.printf("media = %.2f\n", media);
    }
}

