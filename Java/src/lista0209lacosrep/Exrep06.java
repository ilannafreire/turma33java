package lista0209lacosrep;
/*Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
*/
import java.util.Locale;
import java.util.Scanner;

public class Exrep06 {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double numero, multiplo3=0, media=0;
        double cont=0;

        do 
        {
            System.out.println("Digite um número: ");
            numero = in.nextDouble();
            if((numero%3)==0)
            {
                multiplo3 = multiplo3+numero;
                cont++;
            }
        }while(numero!=0);
        System.out.printf("Multiplo3 = %.2f", multiplo3);
        System.out.printf("\ncont = %.2f", cont);
        media =(multiplo3/(cont-1.0));
        System.out.println("\nA media dos números multiplos de 3 é:"+ media);
        in.close();
    }
}