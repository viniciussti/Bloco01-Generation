package exerciciosLa�oCondicional_03_06_2021;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero = 0.0;
		
		System.out.println("Digite um n�mero:");
		numero = ler.nextDouble();
		
		if(numero%2 == 0) {
			System.out.println("Seu n�mero � par!");
			System.out.printf("A raiz do seu n�mero �: " + Math.sqrt(numero),2);
			}
		
			else{
			System.out.println("Seu n�mero � �mpar!");
			System.out.println("O seu n�mero elevado ao quadrado �: " + Math.pow(numero,2));
		}
		ler.close();
	}

}
