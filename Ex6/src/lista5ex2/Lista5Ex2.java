/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5ex2;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista5Ex2 {

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
            digitados++;
            soma = soma+n;
            }while(n!=0);
        
        if (n>=0){
            media = soma/(digitados-1);
        }
        
        digitados=digitados-1;
        System.out.println("Quantidade: "+digitados);
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
        
   
        
    }
    
}
