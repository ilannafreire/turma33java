package Exs;

public class Ex3 {
public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		int i,c = 0; // c é um contador usado para pular linhas
		
		for (i = 1000 ; i <= 1999 ; i++) {
			
			if(i%11 == 5) {
				
				System.out.print(i + "\t"); // imprime os múltiplos de 11 de maneira tabulada.
				c++;
				
			}
			
			if(c == 5) {
				System.out.println(); // para melhor visualização, pula uma linha a cada 5 números impressos 
				c = 0;
			}
			
		}
		
	}
	
}

