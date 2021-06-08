package While_doWhile;
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos. (WHILE)*/
import java.util.Scanner;

public class Exercicios02_While {
		
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			int idade,x=0,sexo,humor,pCalma=0,mNervosas=0,hAgressivos=0,
					oCalmos=0,pNervosa40=0,pCalma18=0;
			
				System.out.println("PESQUISA SOBRE CARACTERÍSTICAS PSICOLÓGICAS");
				System.out.println("===========================================");
				while(x < 150) {
					System.out.println("Informe a sua idade: ");
					idade = ler.nextInt();
					
					System.out.println("Informe o seu sexo: ([1] Masculino - [2] Feminino - [3] Outros) ");
					sexo = ler.nextInt();
					
					System.out.println("Informe o seu humor: ([1] Calmo - [2] Nervoso - [3] Agressivo)");
					humor = ler.nextInt();
				
				if(humor == 1) {
					pCalma++;
				}
				if(sexo == 2 && humor == 2) {
					mNervosas++;
				}
				if(sexo == 1 && humor == 3) {
					hAgressivos++;
				}
				if(sexo == 3 && humor == 1) {
					oCalmos++;
				}
				if(idade>40 && humor == 2) {
					pNervosa40++;
				}
				if(idade<18 && humor == 1) {
					pCalma18++;
				}
				x ++;
				}
				ler.close();
				System.out.println("O número de pessoas calmas é: " + pCalma);
				System.out.println("O número de mulheres  nervosas é de : " + mNervosas);
				System.out.println("O número de homens agresivos é de : " + hAgressivos);
				System.out.println("O número de outros calmos é de : " + oCalmos);
				System.out.println("O número de pessoas nervosas com mais de 40 anos : " + pNervosa40);
				System.out.println("O número de pessoas calmas com menos de 18 anos.: " + pCalma18);
		}
}
