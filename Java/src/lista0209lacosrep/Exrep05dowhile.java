package lista0209lacosrep;
/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * /*No final, mostre a soma dos n�meros digitados
 */
import java.util.Scanner;

public class Exrep05dowhile {

	public static void main(String[]args) {
		 Scanner in = new Scanner(System.in);
		 int numero, soma=0;
		 do
		 {
			 System.out.println("Informe um n�mero: ");
			 numero = in.nextInt();
			 soma+= numero;
			 
		 }while(numero!=0);
		 System.out.printf("Soma total dos valores informados � de: %d ", soma);
		 
		in.close();	 
	}
}
