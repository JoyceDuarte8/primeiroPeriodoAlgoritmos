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
public class aulacap5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, i, soma = 0;
        double media;
        System.out.println("Digite a quantidade de pessoas: ");
        n = leia.nexInt();
        int idade[] = new int[n];

        for (i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "a.pessoa: ");
            idade[i] = leia.nexInt();
            soma = soma + idade[i];

        }
        media = (double) soma / idade.length;
        System.out.println("Soma das idades: " + soma);
        System.out.println("Tamanho do vetor: " + idade.length);
        System.out.printf("Media das idades: %.2f\n", media);
    }
}
