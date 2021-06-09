package Exercicio01_ClientePOO;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String genero;
	private String email;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void informacao( ) {
		
		System.out.println("\nNome: " + nome + "\nGênero: " + genero + "\nCPF: " + cpf + "\nEmail: " + email + "\nTelefone: " + telefone);
	}
}
