package lista5ex4;

import java.util.Scanner;

public class Lista5Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero=0, maior=0, menor=1000;
        
        System.out.print("Número: ");
        do{
            numero = Integer.valueOf(input.nextLine());
            if(numero>maior){
                maior = numero;
            }
            if(numero<menor || numero!=0){
                menor = numero;
            }
        }while (numero!=0);
        System.out.println("Maior número: "+maior);
        System.out.println("Menor número: "+menor);
    }
    
}
