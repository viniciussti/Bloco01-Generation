package ExerciciosArray;

import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
 	Na terceira opção o valor da constante deve ser lido e 
 	o resultado da adição da constante deve ser armazenado na própria matriz.*/

public class Exercicio04_array {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double m1[][] = new double[2][2];
		double m2[][] = new double[2][2];
		double [][] mR = new double[2][2]; 
		int l, c = 0, escolha = 0;
		double soma = 0.0, num1 = 0.0, num2 = 0.0, subtracao = 0.0;

		for (l = 0; l < m1.length; l++) {
			for (c = 0; c < m1.length; c++) {
				System.out.printf("Primeira matriz, posição --> [%d] [%d]: ", l, c);
				m1[l][c] = ler.nextDouble();
				num1 += m1[l][c];
			}
		}
		System.out.println("***************************************");
		System.out.println("***************************************");
		for (l = 0; l < m2.length; l++) {
			for (c = 0; c < m2.length; c++) {
				System.out.printf("Segunda matriz, posição --> [%d] [%d]: ", l, c);
				m2[l][c] = ler.nextDouble();
				num2 += m2[l][c];
			}

		}
		System.out.println("==================");
		System.out.println("MENU DE INTERAÇÕES");
		System.out.println("==================");
		System.out.println("Digite (1) para somar as duas matrizes!");
		System.out.println("Digite (2) para subtrair a primeira matriz da segunda!");
		System.out.println("Digite (3) para adicionar uma constante as duas matrizes!");
		System.out.println("Digite (4) para imprimir as matrizes!");
		escolha = ler.nextInt();

		soma = num1 + num2;
		subtracao = num1 - num2;

		if (escolha == 1) {
			System.out.println("A soma das duas matrizes é de: " + soma);
				mR[l][c] = m1[l][c] + m2[l][c];
		}
		if (escolha == 2) {
			System.out.println("O resultado da subtração da primeira matriz com a segunda é de: " + subtracao);
				mR[l][c] = m2[l][c] - m1[l][c];
		}
		if (escolha == 3) {
			System.out.println("Digite a constante desejada: ");
			@SuppressWarnings("unused")
			int constante = ler.nextInt();
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					m1[l][c] += 2;
					m2[l][c] += 2;
					System.out.printf("Matriz 1 - Posição [%d] [%d] --> ", l, c);
					System.out.println(m1[l][c]);
					System.out.printf("Matriz 2 - Posição [%d] [%d] --> ", l, c);
					System.out.println(m2[l][c]);
				}
			}
			}
				else if(escolha == 4) {
					for (l = 0; l < 2; l++) {
						for (c = 0; c < 2; c++) {
							System.out.println(m1[l][c]);
				}	
				}	
				for (l = 0; l < 2; l++) {
					for (c = 0; c < 2; c++) {
						System.out.println(m2[l][c]);
						}		
					}
				}
		else {
			System.out.println("Opcao invalida");
		}
			}
		
	}


