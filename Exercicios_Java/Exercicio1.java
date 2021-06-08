package Exercicios_Java;

import java.util.Scanner;


public class Exercicio1 {
	/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade,anos,meses,dias;
		
		System.out.println("*Sua idade convertida em dias*");
		System.out.println("=============================");
		System.out.println("Escreva sua idade em anos: ");
		anos = entrada.nextInt();
		
		System.out.println("Escreva sua idade em meses: ");
		meses = entrada.nextInt();
	
		System.out.println("Escreva sua idade em dias: ");
		dias = entrada.nextInt();
		
		anos = anos * 360;
		meses = meses * 30;
		
		idade = anos + meses + dias;
		
		System.out.println("A idade em dias é: " + idade);
		
		entrada.close();
	}
}


