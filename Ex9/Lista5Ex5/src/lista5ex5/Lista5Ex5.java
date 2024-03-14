/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5ex5;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista5Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0;
        
        System.out.println("1 – Inclusão de cliente.\n" +
"2 – Alteração de cliente.\n" +
"3 – Exclusão de cliente.\n" +
"4 – Visualização de cliente.\n" +
"5 – Sair.");
        do{
            System.out.print("Digite a opção desejada: ");
            n = Integer.valueOf(input.nextLine());
            if (n==1){
                System.out.println("Opção escolhida: Inclusão de cliente.");
            }
            if (n==2){
                System.out.println("Opção escolhida: Alteração de cliente.");
            }
            if (n==3){
                System.out.println("Opção escolhida: Exclusão de cliente.");
            }
            if (n==4){
                System.out.println("Opção escolhida: Visualização de cliente.");
            }
            if (n<1||n>5){
                System.out.println("Código Inesistente");
            }
        }while (n!=5);
        System.out.println("Programa encerrado");
    }
    
}
