package Exercicio_Herança;

import java.util.Scanner;

public class TestaAnimais extends Animal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Preguiça preguica1 = new Preguiça();
		Cachorro pitbull = new Cachorro();
		Cavalo cavalo1 = new Cavalo();

		System.out.println("Digite o nome do cachorro: ");
		pitbull.setNome(scan.nextLine());
		System.out.println("Digite a idade do cachorro: ");
		pitbull.setIdade(scan.nextLine());

		System.out.println("Digite o nome do cavalo: ");
		cavalo1.setNome(scan.nextLine());
		System.out.println("Digite a idade do cavalo: ");
		cavalo1.setIdade(scan.nextLine());

		System.out.println("Digite o nome da preguiça: ");
		preguica1.setNome(scan.nextLine());
		System.out.println("Digite a idade da preguiça: ");
		preguica1.setIdade(scan.nextLine());

		System.out.println("==================");
		System.out.println("DADOS DO CACHORRO");
		System.out.println("==================");
		System.out.println("Nome do cachorro: " + pitbull.getNome());
		System.out.println("Idade do cachorro: " + pitbull.getIdade());
		System.out.println("O som que o cachorro emite é o: " + pitbull.emitirSom());
		System.out.println("A ação do cachorro é: " + pitbull.emitirAcao());

		System.out.println("==================");
		System.out.println("DADOS DO CAVALO");
		System.out.println("==================");
		System.out.println("Nome do cavalo é: " + cavalo1.getNome());
		System.out.println("Idade do cavalo é: " + cavalo1.getIdade());
		System.out.println("O som que o cavalo emite é o: " + cavalo1.emitirSom());
		System.out.println("A ação do cavalo é: " + cavalo1.emitirAcao());

		System.out.println("==================");
		System.out.println("DADOS DA BICHO PREGUIÇA");
		System.out.println("==================");
		System.out.println("O nome do bicho preguiça é: " + preguica1.getNome());
		System.out.println("Idade da preguiça: " + preguica1.getIdade());
		System.out.println("O som que a preguiça emite é: " + preguica1.emitirSom());
		System.out.println("A ação da preguiça é: " + preguica1.emitirAcao());

		scan.close();
	}
}
