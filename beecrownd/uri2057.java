/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrownd;

import java.util.Scanner;

/**
 * Assim, para melhor se organizarem para as próximas viagens, eles pediram que
 * você faça um aplicativo para celular que, dada a hora de saída, tempo de
 * viagem e o fuso do destino com relação à origem, você informe a hora de
 * chegada de cada vôo no destino. A entrada contém 3 inteiros: S (0 ≤ S ≤ 23),
 * T (1 ≤ T ≤ 12) e F (-5 ≤ F ≤ 5),
 *
 * @author joyce
 */
public class uri2057 {

    public static void main(String[] args) {

        int S, T, F, horaTotal = 0, horaChegada;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a hora da saída do vôo:\n ");
        S = leia.nextInt();
        System.out.println("Digite o tempo da viagem: \n");
        T = leia.nextInt();
        System.out.println("Digite o fuso horário do destino com relação à origem:\n ");
        F = leia.nextInt();

        if ((0 == S) && (1 <= T && T <= 12) && (-5 <= F && F <= 5)) {
            
            S=24;
            horaTotal = S + T + F;

            horaChegada = horaTotal;
            System.out.println(horaChegada);

            if ((0 <= S && S <= 23) && (1 <= T && T <= 12) && (-5 <= F && F <= 5)) {

                horaTotal = S + T + F;

                horaChegada = horaTotal;

                if (horaTotal == 24) {
                    System.out.println(0);
                } else if (horaTotal > 24) {

                    horaChegada = horaTotal - 24;

                    System.out.println(horaChegada);
                }
                System.out.println(horaChegada);

            }
        }
    }
}
