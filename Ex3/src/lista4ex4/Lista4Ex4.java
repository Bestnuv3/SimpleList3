/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4ex4;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista4Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, idade, cont18=0, cont170=0, idadem=0, idademedia, contalt=0;
        float altura, altmedia=0, alturamedia=0;
        
        for (i=0;i<2;i++){
            System.out.print("Digite a idade do aluno: ");
            idade = Integer.valueOf(input.nextLine());
            System.out.print("Digite a altura do aluno: ");
            altura = Float.valueOf(input.nextLine());
            
            if (idade<18){
                cont18++;
            }
            if (altura<1.7){
                cont170++;
                idadem = idadem +idade;
            }
            if (idade>20){
                contalt++;
               altmedia = altmedia + altura; 
            }
        }
        alturamedia = altmedia/contalt;
        
        if (cont170==0){
            System.out.println("Idade média menor que 1.7: 0");
            System.out.println("Alunos menores de 18: "+cont18);
            System.out.println("Altura média mais de 20: "+alturamedia);
            
        }else{
        idademedia = idadem/cont170;
            
        System.out.println("Alunos menores de 18: "+cont18);
        System.out.println("Idade média menor que 1.7: "+idademedia);
        System.out.println("Altura média mais de 20: "+alturamedia);
    
    }
}
}