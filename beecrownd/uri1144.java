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
public class uri1144 {
    
    public static void main (String [] args){
    int n;
    Scanner leia=new Scanner(System.in);
    
    n=leia.nextInt();
    
     for (int i=1;i<=n;i++){
        
       System.out.println(i+" "+(i*i)+" "+(i*i*i));
       System.out.println(i+" "+(i*i+1)+" "+(i*i*i+1));
    }
}
}
