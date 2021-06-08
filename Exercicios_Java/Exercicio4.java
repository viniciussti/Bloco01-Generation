package Exercicios_Java;
/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = R+S/2, onde R(A+B)² e S=(B+C)²*/
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b,c,d,r,s;
		
		System.out.println("Escreva o valor A:");
		a = entrada.nextInt();
		
		System.out.println("Escreva o valor B:");
		b = entrada.nextInt();
		
		System.out.println("Escreva o valor de C:");
		c = entrada.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println("O valor do resultado é: " + d);
		
		entrada.close();
		
	}
}
