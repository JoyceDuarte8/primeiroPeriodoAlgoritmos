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
public class uri1118 {

    public static void main(String[] args) {
        
        double nota1, nota2, notaProva1 = 0, notaProva2 = 0, media = 0; //nota;
        int valor = 0;
        
        Scanner leia = new Scanner(System.in);
          valor=leia.nextInt();
          
        if (valor < 1 && valor > 2){
            System.out.printf(" novo calculo (1-sim 2-nao)");
        }
        else if {
            nota1 = leia.nextDouble();
            nota2 = leia.nextDouble();
            
            if (nota1 > 0 && nota1 <= 10) {
                notaProva1 = nota1;
            } else if (nota1 < 0 && nota1 > 10) {
                System.out.println("nota inválida");
            }
            if (nota2 > 0 && nota2 <= 10) {
                notaProva2 = nota2;
            } else if (nota2 < 0 && nota2 > 10) {
                System.out.println("nota inválida");
            }
            media = (notaProva1 + notaProva2 / 2);
            System.out.printf(" media= " + media);
        } 
        
    }

}
