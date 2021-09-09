package exemplos0209;

import java.util.Scanner;

public class ex1lacfacaenquanto {
//1-Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 233;
		do {
		
			if((contador >= 400) && (contador <= 500) ) {
		         contador = contador + 5;	
			}
		
		else {
			contador = contador + 3;
		}
		 System.out.println(contador);
		}
			
		 while(contador < 456);
				
				
			}


	}