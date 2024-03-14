/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4ex3;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista4Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i=0, r;
        
        System.out.print("Digite um número: ");
        i = Integer.valueOf(input.nextLine());
        
        n=i;
        
        System.out.println("Tabuada do "+n);
        
        for (r=0;r<=10;r++){
            System.out.println(i+" x "+r+" = "+i*r);

        
        
        
        
        
        }
        
        
    }
    
}
