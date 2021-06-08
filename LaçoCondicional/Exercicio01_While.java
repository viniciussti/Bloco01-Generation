package LaçoCondicional;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class Exercicio01_While {
		
	public static void main(String[] args) {
		
		int idade =0, menor=0, maior=0;
		Scanner ler = new Scanner(System.in);
		
		
		while (idade !=-99) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();	
			
			if(idade<=21) {
				menor++;
			}
			else if(idade>=50) {
				maior++;
			}
			
		}	
		menor = menor - 1;
		System.out.println("O total de pessoas com menos de 21 anos é: " + menor);
		System.out.println("O total de pessoas com mais de 50 anos é: " +  maior);
		
		ler.close();
	}
}	
