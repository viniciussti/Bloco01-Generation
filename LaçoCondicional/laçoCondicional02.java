package LaçoCondicional;

import java.util.Scanner;

public class laçoCondicional02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro número:");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite a operação:");
		operacao = ler.next().charAt(0);
		
		System.out.println("Digite o segundo número:");
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
