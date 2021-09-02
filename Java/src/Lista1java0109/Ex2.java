package Lista1java0109;
//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o primeiro número: ");
        a = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        b = leia.nextInt();

        System.out.println("Digite o terceiro número: ");
        c = leia.nextInt();


             if(a>=b && b>= c) { System.out.printf("Os números em ordem crescente são: %d, %d, %d", c, b, a);} 
        else if(a>=c  && c>= b) { System.out.printf("Os números em ordem crescente são: %d, %d, %d", b, c, a); } 
        else if(b>=a && a>= c) { System.out.printf("Os números em ordem crescente são: %d, %d, %d", c, a, b); } 
        else if(b>=c  && c>=a ) { System.out.printf("Os números em ordem crescente são: %d, %d, %d", a, c, b); }
        else if(c>=b  && b>= a) { System.out.printf("Os números em ordem crescente são: %d, %d, %d", a, b, c); }
        else if(c>=a && a>= b) { System.out.printf("Os números em ordem crescente são: %d, %d, %d", b, a, c); }
		}
		}

