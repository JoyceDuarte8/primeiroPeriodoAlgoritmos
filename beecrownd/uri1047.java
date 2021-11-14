/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 *somain = 0, somaout = 0
 * @author joyce
 */
public class uri1047 {
    public static void main(String []args){
        
        Scanner leia= new Scanner (System.in);
        
        int n, x;
		
		n = leia.nextInt();
		
		while (n > 0) {
			x = leia.nextInt();
			if (x == 0){
				System.out.println("NULL");
			}
			else {
				if (x % 2 == 0) {
					System.out.printf("EVEN");
					if (x < 0){
						System.out.println(" NEGATIVE");
					}
					else {
						System.out.println(" POSITIVE");
					}
				}
				else if (x % 2 != 0){
					System.out.printf("ODD");
					if (x < 0){
						System.out.println(" NEGATIVE");
					}
					else {
						System.out.println(" POSITIVE");
					}
				}
			}
			n = n - 1;
		}
        
        
    }
    
    
}
