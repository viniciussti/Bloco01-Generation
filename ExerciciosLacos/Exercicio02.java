package ExerciciosLacos;

/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1,numero2,numero3;
		
		System.out.println("N�meros em ordem crescente");
		System.out.println("==========================");
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = ler.nextInt();
		
		System.out.println("Digite o teceiro n�mero: ");
		numero3 = ler.nextInt();
		
			if (numero1<= numero2 && numero2 <=numero3) {
			System.out.println("A sequ�ncia num�rica em ordem crescente � : " + numero1 + ", " + numero2 + ", " + numero3);
		}
			else if(numero1 >= numero2 && numero1 <= numero3) {
			System.out.println("A sequ�ncia num�rica em ordem crescente � : " + numero2 + ", " + numero1 + ", " + numero3);
		}	
			else if(numero3 <= numero2 && numero3 <= numero1) {
			System.out.println("A sequ�ncia num�rica em ordem crescente � : " + numero3 + ", " + numero2 + ", " + numero1);
			}
			ler.close();
	}
}