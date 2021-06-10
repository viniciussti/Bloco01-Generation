package Exercicio_Heran�a;

import java.util.Scanner;

public class TestaAnimais extends Animal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Pregui�a preguica1 = new Pregui�a();
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

		System.out.println("Digite o nome da pregui�a: ");
		preguica1.setNome(scan.nextLine());
		System.out.println("Digite a idade da pregui�a: ");
		preguica1.setIdade(scan.nextLine());

		System.out.println("==================");
		System.out.println("DADOS DO CACHORRO");
		System.out.println("==================");
		System.out.println("Nome do cachorro: " + pitbull.getNome());
		System.out.println("Idade do cachorro: " + pitbull.getIdade());
		System.out.println("O som que o cachorro emite � o: " + pitbull.emitirSom());
		System.out.println("A a��o do cachorro �: " + pitbull.emitirAcao());

		System.out.println("==================");
		System.out.println("DADOS DO CAVALO");
		System.out.println("==================");
		System.out.println("Nome do cavalo �: " + cavalo1.getNome());
		System.out.println("Idade do cavalo �: " + cavalo1.getIdade());
		System.out.println("O som que o cavalo emite � o: " + cavalo1.emitirSom());
		System.out.println("A a��o do cavalo �: " + cavalo1.emitirAcao());

		System.out.println("==================");
		System.out.println("DADOS DA BICHO PREGUI�A");
		System.out.println("==================");
		System.out.println("O nome do bicho pregui�a �: " + preguica1.getNome());
		System.out.println("Idade da pregui�a: " + preguica1.getIdade());
		System.out.println("O som que a pregui�a emite �: " + preguica1.emitirSom());
		System.out.println("A a��o da pregui�a �: " + preguica1.emitirAcao());

		scan.close();
	}
}
