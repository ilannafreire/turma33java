package aula170709;

import java.util.Scanner;

public class exemptriang {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double real, base, altura, area;
		
		System.out.println("Qual a base do tri�ngulo?");
		base= leia.nextDouble();
		System.out.println("Qual a altura do tri�ngulo?");
		altura=leia.nextDouble();
		
		if(base > 0 && altura > 0) {
			area = (base = altura)/2;
			System.out.println("A area do triangulo �: " +area);
		}
		else {
			System.out.println("Impossivel realizar, valores informados nulos ou negativos")}
		}
		}
	}
	

