package While_doWhile;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
public class Exercicio01_doWhile {
	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int numero,soma=0;
				
				System.out.println("Infome os números a serem somados");
				System.out.println("Digite '0' para parar a soma, e obter o resultado!");
				System.out.println("==================================================");
			do {
				System.out.println("Digite um número: ");
				numero = ler.nextInt();
				soma+=numero;
			}
			while(numero !=0);
			
			ler.close();
			
			System.out.println("A soma dos números digitados é: " + soma);
		}
	
}
