/*
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
*1 x N = N      2 x N = 2N        ...       10 x N = 10N
*Entrada
*A entrada contém um valor inteiro N (2 < N < 1000).
 */
package beecrownd;

import java.util.Scanner;

/**
 *
 * @author joyce
 */
public class uri1078 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();         
        int i;
        
            for (i = 1; i<=10; i++ ) {
            System.out. printf("%d x %d = %d\n",i,n,i*n);          
          
          }
     
      }
       
}
