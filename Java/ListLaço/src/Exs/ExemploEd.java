package Exs;

import java.util.Scanner;

public class ExemploEd {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// declara��o de todas vari�veis que ser�o necess�rias durante a execu��o do algoritmo
		int idade, sexo, personalidade, pessoasCalmas=0, mulheresNervosas=0,homensAgressivos=0,
			outrosCalmas=0,pessoasNervosasMais40=0, pessoasCalmasMenos18=0, contpessoas = 0;
		
		/* Sexo
		 * 1 - Feminino
		 * 2 - Masculino
		 * 3 - Outros
		 */
		
		/* Personalidade
		 * 1 - Calma
		 * 2 - Nervosa
		 * 3 - Agressiva
		 */
		
		while(contpessoas < 150) {
			
			System.out.println("Insira sua idade:");
			idade = entrada.nextInt();
			
			System.out.println("Insira seu sexo:");
			sexo = entrada.nextInt();
			
			System.out.println("Insira sua personalidade: ");
			personalidade = entrada.nextInt();
			
			
			if (personalidade == 1) { // contabiliza o n�mero de pessoas calmas
				pessoasCalmas++;
				
				if ( idade < 18) { // contabiliza o n�mero de pessoas calmas com menos de 18 anos
					pessoasCalmasMenos18++;
				}
				
			} else if (personalidade == 2 && idade > 40) { // contabiliza o n�mero de pessoas nervosas com mais de 40 anos
				
				pessoasNervosasMais40++;
				
			}
			
			if (sexo == 3 && personalidade == 1) { // contabilza o n�mero de outros Calmos
				outrosCalmas++;
			} else if (sexo == 1 && personalidade == 2) { // contabiliza o n�mero de mulheres nervosas
				mulheresNervosas++;
			} else if (sexo == 2 && personalidade == 3) { // contabiliza o n�mero de homens agressivos
				homensAgressivos++;
			}
			
			contpessoas++;
			
			
		}
		
		entrada.close();
		System.out.println("N�mero de pessoas calmas: " + pessoasCalmas);
		System.out.println("\nN�mero de mulheres nervosas: " + mulheresNervosas);
		System.out.println("\nN�mero de homens agressivos: " + homensAgressivos);
		System.out.println("\nN�mero de outros calmos: " + outrosCalmas);
		System.out.println("\nN�mero de pessoas nervosas com mais de 40 anos: " + pessoasNervosasMais40);
		System.out.println("\nN�mero de pessoas nervosas com menos de 18 anos: " + pessoasCalmasMenos18);
		
	}
	
}

