package ExerciciosArray;

import java.util.Scanner;

/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui*/
public class Exercicio03_array {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int l, c;

		for (l = 0; l < matriz.length; l++) {

			for (c = 0; c < matriz.length; c++) {
				System.out.printf("Digite o valor da matriz [%d] [%d] --> ", l, c);
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.println();
		System.out.println("Os valores das matrizes maiores que 10 foram: ");
		for (c = 0; c < matriz.length; c++) {
			for (l = 0; l < matriz.length; l++) {
				if (matriz[l][c] > 10) {
					System.out.printf("--> " + matriz[l][c]);
					System.out.println();
					ler.close();
				}
			}
		}
	}
}
