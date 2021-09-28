package ListVet;

import java.util.Random;
public class Ex1vet {
	public static void main(String[] args) {
		Random gerador = new Random();
		int valores[]=new int [10],maiorValor=0, contador=0;
		double soma =0.0, media=0.0;
				
			for (int x=0;x<10;x++){
					valores[x] = gerador.nextInt(10);
					System.out.printf(valores[x]+" ");
					soma = soma + valores[x];
					if (valores[x]>=maiorValor){
						if (valores[x]>maiorValor){
							contador = 0;
							contador++;
							maiorValor=valores[x];
						}else {
							contador++;
						}		
					}
			}
			media= (soma)/10;
			System.out.printf("\nA media aritimética dos valores no vetor é: "+media+ "\nE o maior valor foi, "+maiorValor+" que apareceu "+contador+" vez(es)");

	}
}
