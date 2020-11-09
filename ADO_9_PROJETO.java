/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado_9_projeto;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class ADO_9_PROJETO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        double equacao;
        int a = 0;
        int x = 0;
        int b = 0;

        System.out.println("Digite um valor para A: ");
        a = sc.nextInt();

        System.out.println("Digite um valor para B: ");
        b = sc.nextInt();
        
        System.out.println("Digite um valor para X: ");
        x = sc.nextInt();
        
        equacao = (a * x) + b;
        
        System.out.println(equacao);
    }

}
