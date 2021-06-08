package LaçoCondicional;

import java.util.Scanner;

public class laçoCondicional03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma letra entre A e D:");
		String letra = ler.nextLine();
		
		switch(letra) {
			case "A":
			case "a":
				System.out.println("Ana");
			break;
			
			case "B":
			case "b":
				System.out.println("Bruna");
			break;
			
			case "C":
			case "c":
				System.out.println("Cassimiro");
			break;
			
			case "D":
			case "d":
				System.out.println("Djan");
			break;
			
			default:
				System.out.println("Digite apenas letras entre A e D");
		}
		ler.close();
	}

}
