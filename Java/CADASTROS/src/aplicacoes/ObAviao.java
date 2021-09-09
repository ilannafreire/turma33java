package aplicacoes;

import java.util.Scanner;

import classes.Aviao;

/* 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.
  */

public class ObAviao {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Aviao aviao = new Aviao();
			
			System.out.println("Bom dia!");
			System.out.println("Informações do avião: \n");
			System.out.print("Informe o nmero da reserva: ");
			aviao.numeroDaReserva = teclado.nextInt();
			System.out.print("Informe o ano do modelo: ");
			aviao.modelo = teclado.next();
			aviao.informacoesDoVoo();
			
			
			
		}

	}

