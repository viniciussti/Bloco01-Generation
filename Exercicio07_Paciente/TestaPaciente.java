package Exercicio07_Paciente;

import java.util.Scanner;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Paciente paciente1 = new Paciente();
		
		System.out.println("Digite o seu nome completo:");
		paciente1.setNome(scan.nextLine());
		
		System.out.println("Digite a sua idade:");
		paciente1.setIdade(scan.nextLine());
		
		System.out.println("Quais sintomas você está sentindo?:");
		paciente1.setSintomas(scan.nextLine());
		
		System.out.println("Qual especialidade você quer ser encaminhado?:");
		paciente1.setTipo(scan.nextLine());
	
	
		System.out.println("============================================");
		System.out.println("FICHA DO PACIENTE: " + paciente1.getNome());
		System.out.println("============================================");
		
		System.out.println("\nNome do paciente: " + paciente1.getNome() + "\nIdade do paciente: " + paciente1.getIdade() 
		+ "\nSintomas: " + paciente1.getSintomas() + "\nEspecialidade: " + paciente1.getTipo());

	
		scan.close();
	}

}
