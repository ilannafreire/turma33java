package Listaintro;

import java.util.Scanner;

public class Ex1introjava {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dias, meses, anos, bissexto;
		
		//entrada de dados
		System.out.println("Digite os anos:");
		anos = entrada.nextInt();
		bissexto = anos/4; //dividimos a quantidade de anos por 4 para obter os dias do ano bissexto
		
		System.out.println("Digite os meses:");
		meses = entrada.nextInt();
		
		System.out.println("Digite os dias");
		dias = entrada.nextInt();
		
		entrada.close();
		dias = dias + bissexto + 30*meses + 365*anos; //calculo dos dias
		
		System.out.println("Sua idade expressa em dias equivale a: " + dias + " dias.");
		
	}
	
}

