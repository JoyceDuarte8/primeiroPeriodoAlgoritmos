/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

/**
 *
 * @author joyce
 */
public class uri1115 {

    public static void main(String[] args) {
        double x, y;

        Scanner leia = new Scanner(System.in);
        x = leia.nextDouble();
        y = leia.nexDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            x=leia.nexDouble();
            y=leia.nexDouble();
                    
        }
    }
}
