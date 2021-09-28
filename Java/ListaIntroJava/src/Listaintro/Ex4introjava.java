package Listaintro;

import java.util.Scanner;

public class Ex4introjava
{
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b, c, r, s, d;
		
		System.out.println("Informe os valores de A, B e C:");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		entrada.close();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		
		d = (r+s)/2;
		
		System.out.println("O resultado do sistema é:\nD = " + d);
		
	}
	
}

