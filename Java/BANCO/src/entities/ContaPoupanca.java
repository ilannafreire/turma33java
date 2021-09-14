package entities;

import java.util.Calendar;

public class ContaPoupanca extends Conta {

	// atributos
	private int DiaAniversarioPoupanca;
	private double juros;
	private double corrMonetaria;

	// construtor
	public ContaPoupanca(String cpf, int numero, int diaAniversarioPoupanca, double juros, double corrMonetaria) {
		super(cpf, numero);
		DiaAniversarioPoupanca = diaAniversarioPoupanca;
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
	}

	// encapsulamento
	public int getDiaAniversario() {
		return DiaAniversarioPoupanca;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.DiaAniversarioPoupanca = diaAniversario;
	}

	// metodos
	public void aniversarioMes() {

		Calendar hoje = Calendar.getInstance();

		if (DiaAniversarioPoupanca == hoje.get(Calendar.DAY_OF_MONTH)) {
			double valor = 0;

			valor = super.getSaldo() * this.juros;
			valor = valor * this.corrMonetaria;
			credito(valor);
		} else {
			System.out.println("Hoje não é o dia do Rendimento Mensal");
		}

	}

}
