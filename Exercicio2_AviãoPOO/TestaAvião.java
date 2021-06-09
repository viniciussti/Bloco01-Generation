package Exercicio2_AviãoPOO;

public class TestaAvião {

	public static void main(String[] args) {

		Aviao modelo1 = new Aviao();
		Aviao modelo2 = new Aviao();
		Aviao classeA = new Aviao();
		Aviao classeB = new Aviao();

		modelo1.setMarca("LATAM");
		modelo1.setCapacidadePassageiros(150);
		classeA.setValor(1500);
		classeB.setValor(500);

		System.out.println("Companhia aérea: " + modelo1.getMarca());
		System.out.println("Capacidade de passageiros -- > " + modelo1.getCapacidadePassageiros());

		System.out.println("==================================");

		modelo2.setMarca("GOL");
		modelo2.setCapacidadePassageiros(135);

		System.out.println("Companhia aérea: " + modelo2.getMarca());
		System.out.println("Capacidade de passageiros -- > " + modelo2.getCapacidadePassageiros());

		System.out.println("==================================");

		System.out.println("Média de valores das classes para ambas as companhias aéreas");
		System.out.println("Classe A --> " + classeA.getValor() + " R$");
		System.out.println("Classe B --> " + classeB.getValor() + " R$");

	}

}
