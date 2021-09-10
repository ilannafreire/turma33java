package ex2he;

	public class Cachorro extends Animal {
		
		public Cachorro(String nome, int idade) {
			super(nome, idade);
			// TODO Auto-generated constructor stub
		}

		public void correr() {
			System.out.println("Cachorro correndo....");
		}
		@Override
		public void emitirSom() {
			System.out.println("au au au....");
		}
	}
