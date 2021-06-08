package exerciciosLaçoCondicional_03_06_2021;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero1, numero2, numero3, maior = 0;
		
		System.out.println("Descubra o maior número!");
		System.out.println("========================");
		System.out.println("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		maior = numero1;

		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextInt();

		if (numero2 > numero1) {
			maior = numero2;
		}

		System.out.println("Digite o terceiro número: ");
		numero3 = ler.nextInt();

		if (numero3 > numero2) {
			maior = numero3;
		}
		System.out.println("O maior número entre os 3 é: " + maior);

		ler.close();
	}

}
