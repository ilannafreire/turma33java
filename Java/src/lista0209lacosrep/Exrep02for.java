package lista0209lacosrep;
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares./*
 * 
 */
import java.util.Scanner;
public class Exrep02for {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int valor , contador, par= 0, impar =0;
		 for(contador=1; contador <=10; contador++) {
		 
		 System.out.println("Informe um valor: ");
		 valor= in.nextInt();
		 
		 if(valor%2==0) {
			 par++;
			
		 }
		 else {
			 impar ++;
			
		 }
		 }
		 System.out.printf("\n Dos valores informados %d: impar e %d: par", impar, par);

	}


}
