package LaçoCondicional;

import java.util.Scanner;

public class LaçoCondicional {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Media de notas");
		System.out.println("==============");
		
		System.out.println("Digite a primeira nota:");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.0 && media <9) {
			System.out.println("Você foi aprovado!!" + "\nMédia: " + media);
		}
		else if(media >= 9) {
			System.out.println("Aprovado com mérito!" + "\nMédia: " + media);
		}
		else if(media >=3.0 || media <6.0) {
			System.out.println("Você está de recuperação!!" + "\nMédia: " + media);
		}
		else {
			System.out.println("Você foi reprovado!!" + "\nMédia: "+ media);
			
		}
		ler.close();
	}

}
