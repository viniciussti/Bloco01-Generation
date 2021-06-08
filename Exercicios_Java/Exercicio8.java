package Exercicios_Java;
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
			@SuppressWarnings("unused")
			double custoFabrica, custoConsumidor,valorImposto;
			double pDistribuidor ;
			
			System.out.println("Custo de um carro de fábrica convertido para o consumidor");
			System.out.println("=========================================================");
			System.out.println("Qual o custo de fábrica do carro?: ");
			custoFabrica = entrada.nextFloat();
			
			pDistribuidor = custoFabrica + (0.28 * custoFabrica);
			custoConsumidor = pDistribuidor + (pDistribuidor*0.45);
			valorImposto = custoConsumidor - pDistribuidor;
			 
			DecimalFormat df = new DecimalFormat("##.##");
			
			System.out.println("\nO custo de fábrica é: " + df.format(custoFabrica) + " R$");
			System.out.println("\nO custo ao consumidor de um carro novo é: " + df.format(custoConsumidor) + " R$");
				
			entrada.close();	
	}

}
