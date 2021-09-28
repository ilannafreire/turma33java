package Listaintro;

import java.util.Scanner;

public class Ex3introjava {

	public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int segundos, minutos, horas;
			
			System.out.println("Informe a duração do evento em segundos:");
			segundos = entrada.nextInt();
			
			entrada.close();
			
			// calculo para saber horas,minutos e segundos
			horas = segundos/3600;
			minutos = (segundos%3600)/60;
			segundos = (segundos%3600)%60;
			
			System.out.println("O evento durou " + horas + " Horas, " + minutos + " Minutos e " +
								segundos + " Segundos.");{
									
								}
	}
}
		


