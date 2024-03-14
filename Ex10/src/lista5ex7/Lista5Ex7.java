/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5ex7;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Lista5Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a=0, i, res=0;
        
        System.out.println("Número: ");
        n = Integer.valueOf(input.nextLine());
        
        for (i=1;i<=n;i++){
            a=1/i;
            res = a + res;
        }
        System.out.println("Resultado: "+res);
    }
    
}
