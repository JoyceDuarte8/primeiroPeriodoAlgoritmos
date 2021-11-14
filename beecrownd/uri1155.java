/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

/**
 *Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
*S = 1 + 1/2 + 1/3 + … + 1/100
 * @author joyce
 */
public class uri1155 {
    public static void main (String []args){
        
        double s = 0;
        int i;
        for(i=1;i<=10;i++){
            s=s+1.0/i;
        }
        System.out.printf("%.2f\n", s);
    }
}
