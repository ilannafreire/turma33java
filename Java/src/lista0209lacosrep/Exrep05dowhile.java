package lista0209lacosrep;
/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * /*No final, mostre a soma dos números digitados
 */
import java.util.Scanner;

public class Exrep05dowhile {

	public static void main(String[]args) {
		 Scanner in = new Scanner(System.in);
		 int numero, soma=0;
		 do
		 {
			 System.out.println("Informe um número: ");
			 numero = in.nextInt();
			 soma+= numero;
			 
		 }while(numero!=0);
		 System.out.printf("Soma total dos valores informados é de: %d ", soma);
		 
		in.close();	 
	}
}
