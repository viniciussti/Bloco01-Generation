package Exercicio_InterfacePOO;

public class Pregui�aInt extends SuperClasseAnimal implements InterfaceAnimal{

		
		public void som() {
			System.out.println("O som da sua preguicinha: ZzZzz zZZzz Zz");			
		}
		public void subir() {
			System.out.println("As pregui�as podem subir at� 2 Metros de uma �rvore");
		}
		@Override
		public void correr() {
			// TODO Auto-generated method stub
			
		}
}
