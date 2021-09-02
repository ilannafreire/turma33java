package Lista1java0109;
//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x, y, z, maior = 0;
		System.out.println("Escreva o primeiro numero: ");
		 x = leia.nextInt();
		
		System.out.println("Escreva o segundo numero: ");
		 y = leia.nextInt();
	
	    System.out.println("Escreva o terceiro numero: ");
	     z = leia.nextInt();
	     
	     if (x >=y && x>=z) {maior = x;}
	     else if (y>=x && y>=z) {maior = y;}
	     else if (z>=y && z>=x) {maior = z;}
	     System.out.printf("O maior numero é: %d", maior);
	     
}
}
