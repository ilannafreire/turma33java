package Lista1java0109;

import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class Ex4 {
public static void main (String[]args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	
	System.out.println("Digite um numero: ");
	numero = leia.nextInt();
	if(numero== 0) {
		System.out.println(numero + " é neutro");
	}else if(numero < 0) {
		System.out.println(numero + " é negativo");
		
		
	}else if(numero % 2 == 0) {
		System.out.printf(numero + " numero par e sua raiz quadrada é iguala: %f", Math.sqrt(numero));
		
	}else {
		System.out.printf(numero + " numero é impar e seu valor ao quadrado é: %f ", Math.pow(numero, 2));
		
	}
}
}
