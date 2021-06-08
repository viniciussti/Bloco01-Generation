package exerciciosLa�oCondicional_03_06_2021;

/*Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
ZERO.*/

import java.util.Scanner;
public class ExercicioExtra {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double peso, multa, excesso = 4.0;

		System.out.println("Insira o peso dos tomates: ");
		peso = ler.nextDouble();

		if (peso <= 50.0) {
			System.out.println("Voc� n�o exdeceu o limite de peso, e n�o precisar� pagar multa!");
		} else if (peso > 50.0) {
			excesso = peso - 50.0;
			multa = excesso * 4.0;
			System.out.println(
					"Voc� excedeu o limite de kg permitidos em " + excesso + " KG" + "\nDever� pagar R$ " + multa);
		}
		ler.close();
	}

}
