package Exercicios_Java;
/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

	import java.util.Scanner;
	public class Exercicio3 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int horas,minutos,segundos;
			System.out.println("Dura��o em segundos convertida para horas e minutos");
			System.out.println("===================================================");
			System.out.println("Digite quantos segundos durou o seu evento:" );
			segundos = entrada.nextInt();
			
			minutos = segundos/60;
			horas = minutos/60;
 
			System.out.println("O seu evento em horas durou: " + horas + " horas");
			System.out.println("O seu evento em minutos durou " + minutos + " minutos");
			System.out.println("O seu evento em segundos durou " + segundos + " segundos");
			entrada.close();
			
		}
}
