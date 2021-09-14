/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 *  E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 *  Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
 *  caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total
e o salário excedente.
 */


programa
{	
	funcao inicio()
	{

	real salario, horasTrabalhadas, horasExtras,salarioTotal, salarioExcedente//horasTrabalhadas é a variável N que pede o exercicio
	cadeia cod
	escreva("Informe o código do operário")
	leia(cod)
	escreva("Informe a quantidade de horas trabalhadas")
	leia(horasTrabalhadas)
	limpa()
	se(horasTrabalhadas<=50){
		salario=horasTrabalhadas*10
		escreva("Salário do operário: ", cod, " é: R$ ", salario, "\n\n")
		
		
		}
		senao
		{
			salario=500.00
			horasExtras=horasTrabalhadas-50
			salarioExcedente=horasExtras*20.00
			salarioTotal=salario + salarioExcedente
			escreva("Holerite do operário ", cod, " :")
			escreva("\n salario base R$ ", salario, "\n salario excedente R$ ", salarioExcedente, "\n salario total R$ ", salarioTotal)
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */