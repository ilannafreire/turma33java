package Lista1java0109;

import java.util.Scanner;

//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

public class Ex4 {
public static void main (String[]args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	
	System.out.println("Digite um numero: ");
	numero = leia.nextInt();
	if(numero== 0) {
		System.out.println(numero + " � neutro");
	}else if(numero < 0) {
		System.out.println(numero + " � negativo");
		
		
	}else if(numero % 2 == 0) {
		System.out.printf(numero + " numero par e sua raiz quadrada � iguala: %f", Math.sqrt(numero));
		
	}else {
		System.out.printf(numero + " numero � impar e seu valor ao quadrado �: %f ", Math.pow(numero, 2));
		
	}
}
}
