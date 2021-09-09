package lista0209lacosrep;
import java.util.Scanner;
public class Exrep04while {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		 *  psicológicas dos indivíduos de uma região. Para tanto, a cada uma das
		 *   pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 *    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		 *     Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.
		 * 
		 */
		//variaveis
		Scanner leia = new Scanner(System.in);
		final int PESSOAS=3;//depois coloque 150
		int idade=0;
		char sexo; //(1-feminino / 2-masculino / 3-Outros)
		char opcao; //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int pessoasCalmas=0,mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0;
		int pessoasNervosasMais40Anos=0,pessoasCalmasMenos18Anos=0;
		int contador=0;

		//entradas
		while (contador<PESSOAS) {
			contador++;
			System.out.print("Digite a idade  : ");
			idade = leia.nextInt();
			System.out.print("Digite o sexo (1-feminino / 2-masculino / 3-Outros) :  ");
			sexo = leia.next().charAt(0);
			System.out.println("Digite a opção: ");
			System.out.print("1 pessoa calma\n2 pessoa nervosa\n3 pessoa agressiva :  ");
			opcao = leia.next().charAt(0);
			//saida do loop

			if(opcao=='1') {
				pessoasCalmas++;
			} 

			if(sexo=='1' && opcao=='2') {
				mulheresNervosas++;
			}

			if(sexo=='2' && opcao=='3') {
				homensAgressivos++;
			}

			if (sexo=='3' && opcao=='1') {
				outrosCalmos++;
			}

			if (opcao=='2' && idade>40) {
				pessoasNervosasMais40Anos++;
			}
			if (opcao=='1' && idade<18) {
				pessoasCalmasMenos18Anos++;
			}
			System.out.println();
		}
		//saidas
		System.out.println("Total de pessoas cadaastradas : "+contador);
		System.out.println("Pessoas Calmas "+pessoasCalmas);
		System.out.println("Mulheres Nervosas "+mulheresNervosas);
		System.out.println("Homens Agressivos "+homensAgressivos);
		System.out.println("Outros Calmos "+outrosCalmos);
		System.out.println("Pessoas Nervosas Mais 40 Anos "+pessoasNervosasMais40Anos);
		System.out.println("Pessoas Calmas Menos 18 Anos "+pessoasCalmasMenos18Anos);



	}

}
