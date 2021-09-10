package ex2he;

	public class Preguica extends Animal {

		public Preguica(String nome, int idade) {
			super(nome, idade);
			// TODO Auto-generated constructor stub
		}
		
		public void subirArvore() {
			System.out.println("Preguiçaa tentando subir na arvore.....");
		}
		
		@Override 
		public void emitirSom() {
			System.out.println("Aaaaaaaaa");
		}
	}

