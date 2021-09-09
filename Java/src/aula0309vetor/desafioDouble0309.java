package aula0309vetor;

import java.util.Scanner;

public class desafioDouble0309 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double pontos [] = new double[5];
        double maior=0.00;
        System.out.println("Verificando a maior nota-");
        for(int x=0; x<5; x++) {
        System.out.println("Escreva a pontuação da "+(x+1)+"° nota: "); 
        pontos[x] = leia.nextDouble();
        if(pontos[x]>maior) {
            maior=pontos[x];
        }
        }
        System.out.println("A maior nota é "+maior);{
        }}
	
        }
