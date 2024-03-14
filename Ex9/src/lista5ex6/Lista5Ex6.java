/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5ex6;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista5Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, continuar;
        int renda, gastoalimento, gastoaluguel, gastooutro, gastototal, alunos=0, alunos2000=0;
        float proporcaoalimento, proporcaoaluguel, totalaluguel=0, gasto2000=0, gastomedio, media2000;
        
        do{
            System.out.print("Nome: ");
            nome = input.nextLine();
            System.out.print("Renda: ");
            renda = Integer.valueOf(input.nextLine());
            System.out.print("Gasto com alimento: ");
            gastoalimento = Integer.valueOf(input.nextLine());
            System.out.print("Gasto com aluguel: ");
            gastoaluguel = Integer.valueOf(input.nextLine());
            System.out.print("Gasto com outros: ");
            gastooutro = Integer.valueOf(input.nextLine());
            System.out.print("Registrar mais um aluno?(Sim ou Não) ");
            continuar = input.nextLine();
            
            alunos++;
            gastototal = gastoalimento + gastoaluguel + gastooutro;
            proporcaoalimento = 100*gastoalimento/renda;
            proporcaoaluguel = 100*gastoaluguel/renda;   
            System.out.println("Dados de "+nome);
            System.out.println("Gasto total do aluno: "+gastototal);
            System.out.println(proporcaoalimento+"% da renda é para gastos alimentícios");
            System.out.println(proporcaoaluguel+"% da renda é gasta em aluguel");
            
            totalaluguel = totalaluguel+gastoaluguel;
            if (renda>=2000){
                gasto2000 = gasto2000+gastototal;
                alunos2000++;
            }
            
        }while ("Sim".equals(continuar));
        
        gastomedio = totalaluguel/alunos;
        System.out.println("O gasto médio com aluguel de todos os alunos: "+gastomedio);
        media2000 = gasto2000/alunos2000;
        System.out.println("O gasto total médio dos alunos cuja renda familiar é superior a R$ 2000,00: "+media2000);
    }
    
}
