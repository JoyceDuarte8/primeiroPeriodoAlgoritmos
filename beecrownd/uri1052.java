/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 *Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor,
 * deve ser apresentado como resposta o mês do ano por extenso, em inglês, com 
 * a primeira letra maiúscula.
 * @author joyce
 */
public class uri1052 {
    public static void main(String[] args) {
        
       int numero;
       
       Scanner leia=new Scanner (System.in);
       numero=leia.nextInt();
     
     if (numero==1){
         System.out.println("January");
     }
     if (numero==2){
     System.out.println("February");
     }
    if (numero==3){
     System.out.println("March");
     }
    if (numero==4){
     System.out.println("April");
     }
    if (numero==5){
     System.out.println("May");
     }
    if (numero==6){
     System.out.println("June");
     }
     if (numero==7){
         System.out.println("July");
     }
     if (numero==8){
     System.out.println("August");
     }
    if (numero==9){
     System.out.println("September");
     }
    if (numero==10){
     System.out.println("October");
     }
    if (numero==11){
     System.out.println("November");
     }
    if (numero==12){
     System.out.println("December");
     }
    }
}

    

