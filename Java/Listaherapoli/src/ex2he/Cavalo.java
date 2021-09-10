package ex2he;

	public class Cavalo extends Animal{
		

		public Cavalo(String nome, int idade) {
			super(nome, idade);
			// TODO Auto-generated constructor stub
		}
		
		public void correr() {
			System.out.println("Cavalo correndo....");
		}
		@Override 
		public void emitirSom() {
			System.out.println("Irccccc irccccc.");
		}
}
