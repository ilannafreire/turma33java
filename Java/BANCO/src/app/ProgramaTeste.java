package app;

	import java.util.Scanner;

	import entities.Conta;

	public class ProgramaTeste {

		public static void main(String[] args) {
			

			
			Conta cli1 = new Conta("",0);
			
			cli1.credito(200);
			cli1.debito(-50);
			System.out.println(cli1.getSaldo());
			

			
		}

	}
