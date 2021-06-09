package Exercicio06_ContaBancariaPOO;

import java.util.Scanner;

public class TesteContaBancaria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ContaBancaria cb = new ContaBancaria();
		ContaBancaria banco = new ContaBancaria();
		ContaBancaria nome = new ContaBancaria();

		System.out.println("     DEPÓSITO BANCÁRIO");
		System.out.println("===========================");

		System.out.println("Digite o nome do seu banco:");
		banco.setBanco(scan.nextLine());

		System.out.println("Digite seu nome:");
		nome.setNome(scan.nextLine());

		System.out.println("Digite o valor atual da sua conta:");
		cb.setValorTotal(scan.nextDouble());

		System.out.println("Digite o valor a ser depositado:");
		cb.setValorDepositado(scan.nextDouble());
		
		System.out.println("\n==============================");
		System.out.println("==============================");
		System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println("\nNome: " + nome.getNome() + "\nBanco: " + banco.getBanco()
				+ "\nValor antes do depósito: R$ " + cb.getValorTotal() + "\nFoi depositado: R$ "
				+ cb.getValorDepositado() + "\nValor após o depósito: R$ " + cb.deposito(cb.getValorDepositado()));
		
		scan.close();
	}

}
