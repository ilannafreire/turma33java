package app;

import entities.ContaEstudantil;
import entities.Conta;

public class TesteConta {
	public static void main(String[] args) {

		ContaEstudantil cont1 = new ContaEstudantil( "222.222.222-22", 1, 5000.0);
		System.out.println(cont1.toString());	
		cont1.usarEstudantil(6000);
		System.out.println(cont1.toString());
	}
}
