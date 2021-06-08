package LaçoCondicional;
/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
public class Exercicio01_For {
	
	
			public static void main(String[] args) {
				
				int i;
				
				System.out.println("Números de 1000 a 1999 que quando divididos por 11 " + 
						"obtemos resto = 5 ");
				for(i=1000; i <=1999; i++) {
					
				if (i%11==5) {
					System.out.println(i);
				}
				}
			}
}
