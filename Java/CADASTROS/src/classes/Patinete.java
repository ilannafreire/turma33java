package classes;

public class Patinete {
		public boolean ligado=false;
		public String modelo;
		public int velocidade;
		public String cor;
		
		
		public void ligarPatinete() {
			System.out.println("Ligando o patinete...");
			ligado=true;
		}
		public void desligarPatinete() {
			System.out.println("Desligando o patinete...");
			ligado=false;
		}
		public void estadoPatinete() {
			if(ligado) {
				System.out.println("O patinete está ligado.");
			}
			else {
				System.out.println("O patinete está desligado");
			}
	}
		public void cor() {
			System.out.println("\nCor amarelo");
			
		}
		public void velocidade() {
			System.out.println("Velocidade: ");
			System.out.println("automático padrão");
			System.out.println("30km por hora.");
			
			
		}
		public String modelo() {
			String resposta = "Padrão";
			System.out.printf("Modelo: %s", resposta, ".");
			return resposta;
			
		}
	
}
