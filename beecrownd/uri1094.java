/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author joyce
 */
public class uri1094 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int quantidadeTeste = leia.nextInt();
        int i;

        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (i = 1; i <= quantidadeTeste; i++) {
            int quantia = leia.nextInt();
            char tipoCobaia = leia.next().charAt(0); 
            
            totalCobaias = totalCobaias + quantia;
            
            switch (tipoCobaia) {
                case 'C':
                    totalCoelhos = totalCoelhos + quantia;
                    break;
                case 'R':
                    totalRatos = totalRatos + quantia;
                    break;
                case 'S':
                    totalSapos = totalSapos + quantia;

                default:
                    break;
            }
        }

        float percentualCoelhos = (totalCoelhos * 100) / totalCobaias;
        float percentualRatos = (totalRatos * 100) / totalCobaias;
        float percentualSapos = (totalSapos * 100) / totalCobaias;

        System.out.println("Total : " + totalCobaias);
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

    }

}
