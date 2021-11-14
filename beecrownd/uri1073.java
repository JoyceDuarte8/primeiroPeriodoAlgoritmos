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
public class uri1073 {
    public static void main(String[] args) {
        int n = 0, i;
        
        Scanner leia= new Scanner (System.in);
        n=leia.nextInt();
        for (i=2;i<=n;i=i+2){
            System.out.println(i+"^2 = "+(i*i)+"\n");
        }
        
    }
            
}
