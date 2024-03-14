/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5ex3;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista5Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0, digitados=0, soma=0;
        float media=0;
                
        do{
            System.out.print("Número: ");
            n = Integer.valueOf(input.nextLine());
            soma = soma+n;
            
            if(n>0){
                digitados++;
            }
            if(n<0){
                System.out.println("Número: ");
                n = Integer.valueOf(input.nextLine());
            }
        }while(n!=0);
        
        
                
        if (n>=0){
            media = soma/(digitados);
            System.out.println("Quantidade: "+digitados);
            System.out.println("Soma: "+soma);
            System.out.println("Média: "+media);
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
