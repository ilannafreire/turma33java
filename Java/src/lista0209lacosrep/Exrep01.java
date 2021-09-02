package lista0209lacosrep;

/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5/*
 * 
 */
public class Exrep01 {
	public static void main(String[] args) {
		int numero;
		System.out.println("Numeros que divididos por 11 o resto é 5: ");
		for(numero=1000; numero <2000; numero ++)
		{
		if ((numero%11)==5){
		System.out.printf("\n%d", numero);
		
		}
		}
		
		}
		
}
