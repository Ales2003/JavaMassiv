/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamassiv;

/**
 *
 * @author Алекс1
 */
public class JavaMassiv {

    /**
     * @param args the command line arguments
     */
    public static void print (){
    
        System.out.println("****************************");
        
    }
    public static void p(int n){
    System.out.print(n);
            }
    
    public static void main(String[] args) {
        int []a=new int[10];
        
        for(int i=0;i<a.length-1;i++){
                System.out.print(a[i]);
        }
        System.out.println();
        print();
        
        for(int i=0;i<a.length-1;i++){
                a[i]=i;
                JavaMassiv.p(a[i]);
        
        }
        System.out.println();
        print();
        
        


// TODO code application logic here
    }
    
}
