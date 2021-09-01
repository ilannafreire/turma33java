programa {
	
	funcao inicio () {
	/* Faça um sistema que o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 *  
	 */
		inteiro horas, minutos, segundos, segundosDoEvento
		
		escreva ("Digite qual foi o tempo de duração de um evento na fábrica expressa em segundos:")
		leia (segundosDoEvento)

		horas = segundosDoEvento / 3600
		minutos = (segundosDoEvento% 3600) / 60
		segundos = (segundosDoEvento% 3600)% 60

		escreva ("O evento na fábrica teve o tempo estimado em:" + horas + "hora (s)," + minutos + "minuto (s) e" + segundos + "segundo (s).")
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */