/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

programa
{
	
	funcao inicio()
	{
	inteiro n1, n2, n3 , n4
	real q1, q2, q3, q4
	
		escreva("Informe o número 1: ")
		leia (n1)
		escreva("Informe o número 2: ")
		leia (n2)
          escreva("Informe o número 3: ")
		leia (n3)
          escreva("Informe o número 4: ")
		leia (n4)
		q1=n1*n1
		q2=n2*n2
		q3=n3*n3
		q4=n4*n4
		se(q3>=1000){
			escreva("\no valor do quadrado do numero q3 é: ", q3)
			
			
			}senao{
			
			escreva("o valor do quadrado do numero q1 é: ", q1)
			escreva("\no valor do quadrado do numero q2 é: ", q2)
			escreva("\no valor do quadrado do numero q3 é: ", q3)
			escreva("\no valor do quadrado do numero q4 é: ", q4)
			}
				}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */