package Exercicio_InterfacePOO;

public class CachorroInt extends SuperClasseAnimal implements InterfaceAnimal {

	
	public void som() {
		System.out.println("O som do seu cachorrinho: AuAuAuu");
	}
	
	public void correr() {
		System.out.println("O cachorro pode chegar até 50km/h correndo");
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		
	}
}
