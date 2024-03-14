/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4ex5;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista4Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saida=0, contCliente=0, quantDiarias, cont14=0, cont12=0, cont10=0;
        String nome;
        float total;
                
        System.out.print("Hóspedes saindo: ");
        saida = Integer.valueOf(input.nextLine());
        
        for (contCliente=1;contCliente <= saida;contCliente++){
            System.out.print("Nome: ");
            nome = input.nextLine();
            System.out.print("Quantidade de diárias: ");
            quantDiarias = Integer.valueOf(input.nextLine());
            System.out.println(nome);
            if(quantDiarias<10){
                System.out.println("Valor a pagar: 14.00");
                cont14++;
            }
            if(quantDiarias==10){
                System.out.println("Valor a pagar: 12.50");
                cont12++;
            }
            if(quantDiarias>10){
                System.out.println("Valor a pagar: 10.00");
                cont10++;
            }
        }
        
        total = (float) (cont14*14+cont12*12.5+cont10*10);
        
        System.out.println("Total recebido pelo hotel: "+total);
        
        
         
    }
    
}
