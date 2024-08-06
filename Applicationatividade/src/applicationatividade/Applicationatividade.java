/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package applicationatividade;

/**
 *
 * @author gustavo.pmiranda1
 */
public class Conta {
    private int conta;
    private String nome;
    private double valorInicial;

    // Construtor
    public Conta(int conta, String nome, double valorInicial) {
        this.conta = conta;
        this.nome = nome;
        this.valorInicial = valorInicial;
    }

    // Getter para o saldo
    public double saldo() {
        return valorInicial;
    }

    // M�todo para cr�dito
    public void credito(double valor) {
        valorInicial += valor;
        System.out.println("Opera��o de cr�dito realizada com sucesso. Novo saldo: " + valorInicial);
    }

    // M�todo para d�bito
    public void debito(double valor) {
        if (valor <= valorInicial) {
            valorInicial -= valor;
            System.out.println("Opera��o de d�bito realizada com sucesso. Novo saldo: " + valorInicial);
        } else {
            System.out.println("Saldo insuficiente para realizar a opera��o de d�bito.");
        }
    }

    // Getters e setters
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informa��es da conta
        System.out.println("Digite o n�mero da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o nome do titular da conta:");
        String nomeTitular = scanner.nextLine();

        System.out.println("Digite o valor inicial da conta:");
        double valorInicial = scanner.nextDouble();

        // Criar objeto Conta
        Conta conta = new Conta(numeroConta, nomeTitular, valorInicial);

        // Exibir menu de opera��es
        int escolha;
        do {
            System.out.println("\nEscolha a opera��o:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Cr�dito");
            System.out.println("3 - D�bito");
            System.out.println("4 - Sair");

            escolha = scanner.nextInt();

            switch (es
                    
