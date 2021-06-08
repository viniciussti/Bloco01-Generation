package While_doWhile;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio02_doWhile {
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0, i=0;
		double media = 0.0;
		
		System.out.println("[Programa] --> m�dia dos m�ltiplos de 3. "
				+ "\nO programa encerra quando voc� digita 0.");
		System.out.println("========================================");
		
		do {
			System.out.println("*****************");
			System.out.println("Digite um n�mero:");
			System.out.println("*****************");
			numero = ler.nextInt();
			
			if(numero % 3 == 0) {
				soma+= numero;
				i++;
			}
		}
		while( numero !=0);
		
		ler.close();
		
		media = soma / (i-1);
		
		System.out.println("A m�dia dos m�ltiplos de 3 �: " + media);
	}
}
