package Exercicios_Java;

/*Construa um programa em que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
A fórmula que efetua tal cálculo é: d= RAIZ de (x2-x1)² + (y2-y1)²*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio6 {

	public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("##.##");
			double x1,x2,y1,y2,d = 0;
			double raiz = 2.0;
			
			System.out.println("Cálculo da distância entre dois pontos");
			System.out.println("======================================");
			System.out.println("Insira o valor de x1: ");
			x1 = entrada.nextDouble();
			
			System.out.println("Insira o valor de x2: ");
			x2 = entrada.nextDouble();
			
			System.out.println("Insira o valor de y1: ");
			y1 = entrada.nextDouble();
			
			System.out.println("Insira o valor de y2: ");
			y2 = entrada.nextDouble();
			 
			//d= ((x2-x1) * (x2-x1)) + ((y2-y1 ) * (y2-y1));
			d= Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
			raiz = Math.sqrt(d);
		
			System.out.println("O valor de D é --> " +  d);
			System.out.println("O valor da raiz D é --> " + df.format(raiz));

			entrada.close();	
	}
}
