package While_doWhile;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class Exercicio01_doWhile {
	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int numero,soma=0;
				
				System.out.println("Infome os n�meros a serem somados");
				System.out.println("Digite '0' para parar a soma, e obter o resultado!");
				System.out.println("==================================================");
			do {
				System.out.println("Digite um n�mero: ");
				numero = ler.nextInt();
				soma+=numero;
			}
			while(numero !=0);
			
			ler.close();
			
			System.out.println("A soma dos n�meros digitados �: " + soma);
		}
	
}
