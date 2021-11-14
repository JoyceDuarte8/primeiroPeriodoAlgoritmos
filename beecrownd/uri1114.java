package beecrownd;


import java.util.Scanner;

/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida.
*Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
*Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso 
*Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
package uri;

/**
 *
 * @author joyce
 */
public class uri1114 {

    public static void main(String[] args) {

        int numero;

        Scanner leia = new Scanner(System.in);

        do {
            numero = leia.nextInt();
            
            if (numero!=2002){
            System.out.println("Senha Invalida");
            }

        } while (numero != 2002);

         System.out.println("Acesso Permitido");
    

    }
}
