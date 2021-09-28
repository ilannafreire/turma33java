package ListVet;
import java.util.Scanner;
public class Ex5vet {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n,soma=0;
		do {
			System.out.println("Entre com o numero ");
			n=leia.nextInt();
			soma+=n;
			
		}while(n!=0);
		System.out.printf("A soma dos numeros digitado é %d",soma);{
		
	}
}

}
