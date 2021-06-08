package Exercicios_Java;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
expressa em anos, meses e dias.*/

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anos,meses,idade;
		
		System.out.println("*Sua idade em dias convertida para anos e meses*");
		System.out.println("===============================================");
		System.out.println("Escreva sua idade em dias: ");
		idade = entrada.nextInt();
		
		anos = idade / 365;
		meses = idade/ 30;
	
		System.out.println("A sua idade em anos: " + anos + " anos!");
		System.out.println("A sua idade em meses é: " + meses + " meses!");
		System.out.println("A sua idade em dias é " + idade + " dias!");
		
		entrada.close();
	
	}
}
