package entities;

	public class ContaEspecial extends Conta {
		
		//atributos
		private double limite;

		
		//construtor
		public ContaEspecial(String cpf, int numero, double limite) {
			super(cpf, numero);
			this.limite = limite;
		}
		

		//encapsulamento
		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		//metodos
		public void usarLimite(double limite) {
		//Criar método
				
		}

	}

