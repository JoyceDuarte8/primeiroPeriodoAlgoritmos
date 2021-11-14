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
public class uri1146 {
    public static void main(String[] args) {
        int n;
        Scanner leia =new Scanner (System.in);
        n=leia.nexInt();
        
        while (n!=0){
        for (int i=1;i<=n;i++){
          if (i == n) {
              System.out.print(i + "\n");
          }
         else{
             System.out.print(i + " ");
         }
        }
        }
        
           n=leia.nexInt();
    }
}
