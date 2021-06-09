package Exercicio06_ContaBancariaPOO;

public class ContaBancaria {
	
	private String nome;
	private String banco;
	private double valorDepositado;
	private double valorConta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getValorDepositado() {
		return valorDepositado;
	}
	public void setValorDepositado(double valorDepositado) {
		this.valorDepositado = valorDepositado;
	}
	public double getValorTotal() {
		return valorConta;
	}
	public void setValorTotal(double valorTotal) {
		this.valorConta = valorTotal;
	}
	
	public double deposito(double valorDepositado) {
		return valorConta + valorDepositado;
	}
}
