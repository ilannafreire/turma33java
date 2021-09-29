package Exs;

import java.util.Scanner;

public class Ex1 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, contPar = 0, contImpar = 0;
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			System.out.println("Insira um numero:");
			numero = entrada.nextInt();
			
			if(numero%2 == 0) { //
				contPar++;
			} else { // 
				contImpar++;
			}
		}
		
		entrada.close();
		System.out.println("Quantidade de números pares: " + contPar);
		System.out.println("Quantidade de números ímpares: " + contImpar);
		
	}
	
}

