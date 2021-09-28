package Listaintro;

import java.util.Scanner;
public class Ex2introjava {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dias, meses = 0, anos = 0, bissexto = 0;
		
		System.out.println("Insira sua idade expressa em dias:");
		dias = entrada.nextInt();
		
		entrada.close();
		
		while(dias >= 365) { 
			anos++;
			dias -= 365;
			bissexto++;
			
			if (bissexto == 4) { 
				dias--;
				bissexto = 0;
			}
		}
		
		while(dias >= 30) { 
			meses++;
			dias -= 30;
		}
		
		System.out.println("Você tem " + anos + " Anos, " + meses + " Meses e " +
							dias + " Dias de idade.");
		
	}
	
}

