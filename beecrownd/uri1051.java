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
public class uri1051 {

    public static void main(String[] args) {
        
        double salario;
        
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário");
        
        salario = leia.nextDouble();
        
        double valorImposto = 0;
    if (salario<=2000) {
        System.out.print("Isento");

} else {
        if(salario > 2000){
            valorImposto = valorImposto + 0.08*Math.min(1000, salario - 2000);
        }
        
        if(salario > 3000){
            valorImposto = valorImposto + 0.18*Math.min(1500, salario - 3000);
        } 
        
        if(salario > 4500) {
            valorImposto = valorImposto + 0.28*(salario - 4500);
        }
        
        System.out.printf("R$ %.2f\n",valorImposto);
        
        
    }
}
}



