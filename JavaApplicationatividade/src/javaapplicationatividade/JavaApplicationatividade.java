/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationatividade;

import java.util.Scanner;

/**
 *
 * @author gustavo.pmiranda1
 */
public class JavaApplicationatividade {
    public static void main(String[] args) {
        Scanner ler = new Scanner( System.in);
        String nome;
        
       double Nota1,Nota2,Nota3, Média;
       
       System.out.println("Nome do aluno:");
       nome = ler.nextLine();
       System.out.println("Digite a primeira nota:");
       Nota1 = ler.nextDouble();
       System.out.println("Digite a segunda nota:");
       Nota2 = ler.nextDouble();
       System.out.println("Digite a terceira nota:");
       Nota3 = ler.nextDouble();
       
       Média = (Nota1 + Nota2 + Nota3) / 3.0;
       System.out.printf("A média é de = %.2f", Média);
       
       ler.close();
        
    }
    
}
