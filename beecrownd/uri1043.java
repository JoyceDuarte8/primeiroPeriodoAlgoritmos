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
public class uri1043 {
    public static void main(String[] args) {
    int horaInicial, minutoInicial,horaFinal,minutoFinal,hora = 0,minuto=0;
        
    Scanner leia=new Scanner(System.in);
    System.out.print("Digite a hora inicial: ");
    horaInicial=leia.nextInt();
        System.out.print("Digite o minuto inicial: ");
    minutoInicial=leia.nextInt();
        System.out.print("Digite a hora final: ");
    horaFinal=leia.nextInt();
        System.out.print("Digite o minuto final: ");
    minutoFinal=leia.nextInt();
    
    if (horaFinal<24){
        hora =horaFinal-horaInicial;
    }
    if (minutoInicial>1&& minutoFinal<=59){
     minuto=minutoFinal-minutoInicial;
    }
    
    System.out.print("O JOGO DUROU "+ hora +" HORA(S) E "+minuto+" MINUTO(S)");

}
}

