 programa {
	
	funcao inicio () {
	
		/* Faça um sistema que a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		*/
		
		inteiro idade, mes, dias, idadeEmDias

		// entrada
		escreva ("Qual a sua idade em dias ?:")
		leia (idadeEmDias)

		// processamento
		idade = idadeEmDias / 365
		mes = (idadeEmDias% 365) / 30
		dias = (idadeEmDias% 365)% 30

		// saida
		escreva ("Sua idade é" + idade + "anos," + mes + "mes (es) e" + dias + "dias.")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */