package Exercicios_Java;
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double n1,n2,n3;
		double p1,p2,p3;
		double media;
		
		System.out.println("Média de notas Ponderada");
		System.out.println("========================");
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o peso da primeira nota: ");
		p1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
	
		System.out.println("Digite o peso da segunda nota: ");
		p2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		System.out.println("Digite o peso da terceira nota: ");
		p3 = entrada.nextDouble();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A média do aluno é --> " + media);
	
		entrada.close();
	}
}
