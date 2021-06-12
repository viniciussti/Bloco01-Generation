package ExercicioArrayList;

/*Crie uma um programa para trabalhar com estoque de uma loja, 
 o programa dever� trabalhar com Collection do tipo List do Java
 para manipular os dados desse estoque, o programa dever� atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

import java.util.*;

public class TestaEstoque {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> estoques = new ArrayList<>();

		System.out.println("================");
		System.out.println("LISTA DE COMPRAS");
		System.out.println("================");

		System.out.println("Quantos produtos voc� deseja acrescentar na lista?");
		int quantidade = scan.nextInt();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("\nDigite o nome do produto: ");
			String produto = scan.next();

			scan.nextLine();

			estoques.add(new String(produto));

		}

		System.out.println("\nQuantidade de produtos adicionados: [" + quantidade + "]");

		for (String i : estoques) {

			System.out.println(i);
		}
		System.out.println("\nVoc� deseja remover algum item da lista?");
		System.out.println("Digite [1] - SIM");
		System.out.println("Digite [2] - N�O");
		int opcao = scan.nextInt();

		if (opcao == 1) {
			System.out.println("\nDigite o n�mero do produto a ser removido:");
			for (int x = 0; x < quantidade; x++) {
				System.out.printf("N�mero %d --> %s\n", x, estoques.get(x));
			}
			int rm = scan.nextInt();

			estoques.remove(rm);
			System.out.println("\n===================");
			System.out.println("LISTA ATUALIZADA:");
			System.out.println("===================");
			for (String i : estoques) {
				System.out.println(i);
			}
		} else {
			System.out.println("\n===================");
			System.out.println("LISTA ATUALIZADA:");
			System.out.println("===================");
			for (String i : estoques) {
				System.out.println(i);
			}
		}

		scan.close();
	}
}
