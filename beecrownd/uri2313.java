/*
 * triangulo
 */
package beecrownd;

import java.util.Scanner;

/**
 *
 * @author joyce
 */
public class uri2313 {

    public static void main(String[] args) {

        int A, B, C;

        Scanner leia = new Scanner(System.in);
        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            if (A==B&&B==C&&C==A){
             System.out.print("Valido-Equilatero\n");
            }
            else if (A!=B&&B!=C&&A!=C){
              System.out.print("Valido-Escaleno\n");
            }
            else if (A==B&&A!=C||A==C&&A!=B||B==C&&B!=A||C==A&&C!=B){
              System.out.print("Valido-Isoceles\n");
            }
            
          if((B*B==A*A+C*C)||(A*A==B*B+C*C)||(C*C==A*A+B*B)){
                System.out.print("Retangulo: S\n");
          }
                else {
                System.out.print("Retangulo: N\n");
           }
        } else {
            System.out.print("Inválido\n");
        }
    }
}
