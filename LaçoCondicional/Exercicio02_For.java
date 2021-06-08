package LaçoCondicional;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class Exercicio02_For {
	
		public static void main(String[] args) {
			
			
			int numero,par = 0,impar=0;
			Scanner ler = new Scanner(System.in);
			
			for(numero=0; numero <= 10; numero++) {
				System.out.println("Digite um número: ");
				numero = ler.nextInt();	
			
				if(numero %2 == 0) {
					par++;
				}
				else {
					impar++;
				}
				ler.close();
			}
			System.out.println("A quantidade de números par são: " + par);
			System.out.println("A quantidade de números ímpar são: " + impar);
			
			
}
		}

