package aplicacoes;

import java.util.Scanner;

import classes.Aviao;

/* 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente 
 * as informa��es deste objeto no console.
  */

public class ObAviao {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Aviao aviao = new Aviao();
			
			System.out.println("Bom dia!");
			System.out.println("Informa��es do avi�o: \n");
			System.out.print("Informe o nmero da reserva: ");
			aviao.numeroDaReserva = teclado.nextInt();
			System.out.print("Informe o ano do modelo: ");
			aviao.modelo = teclado.next();
			aviao.informacoesDoVoo();
			
			
			
		}

	}

