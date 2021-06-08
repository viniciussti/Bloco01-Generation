package Exercicios_Java;
/*Um sistema de equações lineares do tipo: "ax + by = c" e " dx + ey = f ",
 * pode ser resolvido segundo mostrado abaixo : x = ce - bf / ae - bd
 * y = af - cd / ae - bd
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		float a,b,c,d,e,f,x,y,F;
		
		System.out.println("Sistema de equação linear");
		System.out.println("=========================");
		
		System.out.println("Insira o valor de A: ");
		a = entrada.nextFloat();
		
		System.out.println("Insira o valor de B: ");
		b = entrada.nextFloat();
		
		System.out.println("Insira o valor de C: ");
		c = entrada.nextFloat();
		
		System.out.println("Insira o valor de D: ");
		d = entrada.nextFloat();
		
		System.out.println("Insira o valor de E: ");
		e = entrada.nextFloat();
		
		System.out.println("Insira o valor de F: ");
		f = entrada.nextFloat();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));

		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		c = ((a * x) + (b * y));

		F = ((d * x) + (e * y));
		
		System.out.println(" \n O valor de x é: " + df.format(x));
		System.out.println(" \n O valor de y é: " + df.format(y));
		System.out.println(" \n O valor de c é: " + df.format(c));
		System.out.println(" \n O valor de f é: " + df.format(F));
		
		entrada.close();
	}

}
