package exerciciosLa�oCondicional_03_06_2021;
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Veja aqui qual a sua categoria!");
		System.out.println("===============================");
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		if(idade >=10 && idade <=14) {
			System.out.println("Sua categoria é Infantil!");
		}
		
		else if(idade >=15 && idade <=17) {
			System.out.println("Sua categoria é Juvenil");
		}
		else if(idade >= 18 && idade <=25) {
			System.out.println("Sua categoria é Adulto");
		}
		
		if (idade < 10 || idade >25) {
			System.out.println("Idade não correspondente a uma categoria!");
		}
		ler.close();
		}

}
