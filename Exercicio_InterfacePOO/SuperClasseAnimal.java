package Exercicio_InterfacePOO;

public abstract class SuperClasseAnimal implements InterfaceAnimal {

	private String nome;
	private String idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	

	
//	public String emitirSom(String emitirSom) {
//		return emitirSom;
//	}
//
//	public String emitirAcao(String emitirAcao) {
//		return emitirAcao;
//	}

}
