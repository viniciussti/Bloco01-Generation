package La�oCondicional;

import java.util.Scanner;

/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
public class Exercicio02_For {
	
		public static void main(String[] args) {
			
			
			int numero,par = 0,impar=0;
			Scanner ler = new Scanner(System.in);
			
			for(numero=0; numero <= 10; numero++) {
				System.out.println("Digite um n�mero: ");
				numero = ler.nextInt();	
			
				if(numero %2 == 0) {
					par++;
				}
				else {
					impar++;
				}
				ler.close();
			}
			System.out.println("A quantidade de n�meros par s�o: " + par);
			System.out.println("A quantidade de n�meros �mpar s�o: " + impar);
			
			
}
		}

