package Exercicio01_ClientePOO;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.println("=====================");
		System.out.println("CADASTRO DE CLIENTE");
		System.out.println("=====================");
		
		System.out.println("\nDigite o seu nome: ");
		cliente1.setNome(scan.nextLine());
		
		System.out.println("Digite o gênero: " );
		cliente1.setGenero(scan.nextLine());
		
		System.out.println("Digite o seu CPF: ");
		cliente1.setCpf(scan.nextLine());
		
		System.out.println("Digite o seu email: ");
		cliente1.setEmail(scan.nextLine());
		
		System.out.println("Digite o seu telefone: ");
		cliente1.setTelefone(scan.nextLine());
		
		System.out.println("\n=====================");
		System.out.println("FICHA DO CLIENTE");
//		System.out.println("=====================");
		
		cliente1.informacao();
	
		scan.close();
	}
	
}
