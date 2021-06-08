package exerciciosLaçoCondicional_03_06_2021;

/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.*/

import java.util.Scanner;
public class ExercicioExtra {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double peso, multa, excesso = 4.0;

		System.out.println("Insira o peso dos tomates: ");
		peso = ler.nextDouble();

		if (peso <= 50.0) {
			System.out.println("Você não exdeceu o limite de peso, e não precisará pagar multa!");
		} else if (peso > 50.0) {
			excesso = peso - 50.0;
			multa = excesso * 4.0;
			System.out.println(
					"Você excedeu o limite de kg permitidos em " + excesso + " KG" + "\nDeverá pagar R$ " + multa);
		}
		ler.close();
	}

}
