package Lista1java0109;
//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade= leia.nextInt();
		if (idade <= 25 && idade >= 18) {
			System.out.println("Categoria adulto");
		}else if(idade <= 17 && idade >= 15) {
			System.out.println("Categoria juvenil");
		}else if(idade >=10 && idade <= 14) {
			System.out.println("Categoria infantil");
			}else {
				System.out.println("Sua idade n�o se encaixa em nenhuma categoria");
				
			}
		}
	
	
}
