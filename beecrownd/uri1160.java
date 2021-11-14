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
public class uri1160 {
   public static void main (String []args){
        
        double s = 1;
        int i,x=2;
        for(i=3;i<=39;i++){
        if (i%2==1){
            s+= (double) i/x;
            x*=2.00;
            }
        }
        System.out.printf("%.2f\n", s);
    }
}
