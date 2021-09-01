programa {
	
	funcao inicio () {
		inteiro anos, meses, dias
		inteiro idadeEmDias
				
		// Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
		escreva ("Digite sua idade em anos:")
		leia (anos)
		escreva ("Digite meses a partir de sua idade completa:")
		leia (meses)
		escreva ("Digite dias após mais um mês completo:")
		leia (dias)
		
		idadeEmDias = anos * 365 + meses * 30 + dias
		escreva ("Sua idade em dias é aproximadamente:" + idadeEmDias)

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */