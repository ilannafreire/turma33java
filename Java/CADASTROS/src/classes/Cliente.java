package classes;

public class Cliente {
		//atributos
		private String cpf;
		private String nome;
		private int anoNascimento;
		private char pronome; // 1- senhor, 2 - senhora, 3 - senhore
		private boolean ativo;
			
		//construtor
		public Cliente(String cpf) {
			this.cpf = cpf;
		}
			
		public Cliente(String cpf, String nome) {
			super();
			this.cpf = cpf;
			this.nome = nome;
		}




		//encapsulamento
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getAnoNascimento() {
			return anoNascimento;
		}
		public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
		}
		public char getPronome() {
			return pronome;
		}
		public void setPronome(char pronome) {
			this.pronome = pronome;
		}
		public boolean isAtivo() {
			return ativo;
		}
		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		
		
		//metodos(funçao dentro da classe)
		public int mostraIdade() {		
			return (2021 - this.anoNascimento);
		}
		public int mostraIdade(int anoAtual) {		
			return (anoAtual - this.anoNascimento);
		}
		
		//void é usado quando o programa não retorna algo*
		public void ativarCliente() {
			ativo = true;
		}
		public void desativarCliente() {
			ativo = false;
		}
		
		public String tratamento() {
			String resposta = "";
			if (this.pronome == '1') {
				resposta = "Senhor";
			} 
			else if(this.pronome == '2') {
				resposta = "Senhora";
			} 
			else if (this.pronome == '3') {
				resposta = "Senhore";
			} else {
				resposta = "Senhorx";
			}
			return resposta;
		}
	}

