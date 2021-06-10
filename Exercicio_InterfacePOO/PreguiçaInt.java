package Exercicio_InterfacePOO;

public class PreguiçaInt extends SuperClasseAnimal implements InterfaceAnimal{

		
		public void som() {
			System.out.println("O som da sua preguicinha: ZzZzz zZZzz Zz");			
		}
		public void subir() {
			System.out.println("As preguiças podem subir até 2 Metros de uma árvore");
		}
		@Override
		public void correr() {
			// TODO Auto-generated method stub
			
		}
}
