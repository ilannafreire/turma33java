package lista0209lacosrep;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. /*
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99
 */
public class Exrep03while {


public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	
	int idade, menor21=0, maior50=0;
	    System.out.println("Informe sua idade");
	idade = in.nextInt();
	 while(idade>-99) {
		 
		if(idade<21 && idade>=0)
		{
			 menor21++;
		}
	 
	 else if (idade>50)
	 {
		 maior50++;
	 }
	 System.out.printf("Informe sua idade: " );
	 idade = in.nextInt();
	 }
	 System.out.printf("Pessoas com menos de 21 anos: %d", menor21);
	 System.out.printf("\nPessoas com mais de 50 anos: %d", maior50);
	 in.close();
	 }
}
