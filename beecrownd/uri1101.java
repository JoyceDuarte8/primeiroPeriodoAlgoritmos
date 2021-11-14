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
public class uri1101 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, m, aux,soma,i;

        while (n > 0 && m > 0) {
            n = leia.nextInt();
            m = leia.nextInt();
            if (m < n) {
                aux = n;
                n = m;
                m = aux;
            }
            soma = 0;
            for (i = n; i <= m; i++) {
                System.out.println(i + " ");
                soma = soma + i;

            }
            System.out.println("Sum=" + soma);
            n = leia.nextInt();
            m = leia.nextInt();
        }
    }

}
