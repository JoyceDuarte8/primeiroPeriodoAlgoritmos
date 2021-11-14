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
public class uri1159 {
    public static void main(String[] args) {
        int x,i,cont = 0,somapar=0;
        Scanner leia=new Scanner (System.in);
        x=leia.nextInt();
       while (x!=0){
           if(x%2==0){
               for (i=x;i<=x+8;i+=2){
                   somapar+=cont;
               }
               System.out.println(somapar);
           }
           else{
               for (i=x+1;i<=x+9;i+=2){
                   somapar+=cont;
               }
                System.out.println(somapar);
           }
           x=leia.nextInt();
           somapar=0;
       }
      leia.close();
}
}
