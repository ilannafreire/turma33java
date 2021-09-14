package entities;

public class ContaEstudantil extends Conta {
	private double limiteEstudantil;

	// Atributos

	// Construtor # HERANÇA
	public ContaEstudantil(String cpf, int numero, double limiteEstudantil) {
		super(cpf, numero);
		this.limiteEstudantil = limiteEstudantil;
	}

	// Encapsulamento
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}

	// metodos
	public void usarEstudantil(double limiteSolicitado) {
		if (limiteSolicitado <= 0) {
			System.out.println("Entrada inválido");
		} else if (limiteSolicitado > this.limiteEstudantil) {
			System.out.println("Limite indisponível");
		} else {
			this.limiteEstudantil = this.limiteEstudantil - limiteSolicitado;
			super.credito(getSaldo() + limiteSolicitado);
		}

	}

	@Override
	public String toString() {
		return "Conta numero=" + super.getNumero() + ", cpf=" + super.getCpf() + ", saldo=" + super.getSaldo() + " limiteEstudantil= " + limiteEstudantil;
		
	}

}
