package La�oCondicional;

import java.util.Scanner;

public class la�oCondicional02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro n�mero:");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite a opera��o:");
		operacao = ler.next().charAt(0);
		
		System.out.println("Digite o segundo n�mero:");
		numero2 = ler.nextDouble();
		
		if(operacao == '+') {
			resultado = numero1 + numero2;
		}
		else if(operacao == '-') {
			resultado = numero1 - numero2;
		}
		else if(operacao == '*' || operacao == 'x' || operacao == 'X') {
			resultado = numero1 * numero2;
		}
		else if(operacao == '/' || operacao == '%') {
			resultado = numero1 / numero2;
		}
		
		System.out.println("Resultado: " + resultado);
		ler.close();
	}
}
