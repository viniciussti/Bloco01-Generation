package exerciciosLa�oCondicional_03_06_2021;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero1, numero2, numero3, maior = 0;
		
		System.out.println("Descubra o maior n�mero!");
		System.out.println("========================");
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = ler.nextInt();
		maior = numero1;

		System.out.println("Digite o segundo n�mero: ");
		numero2 = ler.nextInt();

		if (numero2 > numero1) {
			maior = numero2;
		}

		System.out.println("Digite o terceiro n�mero: ");
		numero3 = ler.nextInt();

		if (numero3 > numero2) {
			maior = numero3;
		}
		System.out.println("O maior n�mero entre os 3 �: " + maior);

		ler.close();
	}

}
