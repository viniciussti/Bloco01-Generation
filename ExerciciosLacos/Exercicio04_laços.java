package exerciciosLaçoCondicional_03_06_2021;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero = 0.0;
		
		System.out.println("Digite um número:");
		numero = ler.nextDouble();
		
		if(numero%2 == 0) {
			System.out.println("Seu número é par!");
			System.out.printf("A raiz do seu número é: " + Math.sqrt(numero),2);
			}
		
			else{
			System.out.println("Seu número é ímpar!");
			System.out.println("O seu número elevado ao quadrado é: " + Math.pow(numero,2));
		}
		ler.close();
	}

}
