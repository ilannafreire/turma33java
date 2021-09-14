programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro num

		//entradas
		
		escreva("Digite um número: ")
		leia(num)
		//processamento  & saídas 
		se (num < 0){	
			escreva("O número é negativo, Impossível realizar")
		}
		senao se (num == 0){
			escreva("O número, ", num, " Neutro")
		}

		senao se(num % 2 == 0){
			escreva("O número, " , num, " é par!")
		}
		senao se(num % 2 ==1){
			escreva("O número, ", num, " é ímpar!")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */