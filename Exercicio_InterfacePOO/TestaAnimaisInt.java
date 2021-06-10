package Exercicio_InterfacePOO;

import java.util.Scanner;

	public class TestaAnimaisInt  {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		PreguiçaInt preguica1 = new PreguiçaInt();
		CachorroInt cachorro1 = new CachorroInt();
		CavaloInt cavalo1 = new CavaloInt();
		
		System.out.println("Digite o nome do seu cachorrinho: ");
		cachorro1.setNome(scan.nextLine());
		System.out.println("Digite a idade do seu cachorrinho: ");
		cachorro1.setIdade(scan.nextLine());

		System.out.println("Digite o nome do seu cavalinho: ");
		cavalo1.setNome(scan.nextLine());
		System.out.println("Digite a idade do seu cavalinho: ");
		cavalo1.setIdade(scan.nextLine());

		System.out.println("Digite o nome da sua preguicinha: ");
		preguica1.setNome(scan.nextLine());
		System.out.println("Digite a idade da sua preguicinha: ");
		preguica1.setIdade(scan.nextLine());

		System.out.println("===============================");
		System.out.println("DADOS DO SEU CACHORRINHO: " + cachorro1.getNome());
		System.out.println("===============================");
		System.out.println("Nome do seu cachorro: " + cachorro1.getNome());
		System.out.println("Idade do seu cachorro: " + cachorro1.getIdade());
		cachorro1.som();
		cachorro1.correr();


		System.out.println("===============================");
		System.out.println("DADOS DO SEU CAVALINHO: " + cavalo1.getNome());
		System.out.println("===============================");
		System.out.println("Nome do cavalo é: " + cavalo1.getNome());
		System.out.println("Idade do cavalo é: " + cavalo1.getIdade());
		cavalo1.som();
		cavalo1.correr();

		System.out.println("===============================");
		System.out.println("DADOS DA SUA PREGUICINHA: " + preguica1.getNome());
		System.out.println("===============================");
		System.out.println("O nome da sua preguicinha é: " + preguica1.getNome());
		System.out.println("Idade da preguiça: " + preguica1.getIdade());
		preguica1.som();
		preguica1.subir();

		scan.close();
	}
}
