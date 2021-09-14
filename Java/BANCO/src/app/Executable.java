	package app;

	import java.util.Scanner;

	import entities.ContaCorrente;
	import entities.ContaEmpresa;
	import entities.ContaEspecial;
	import entities.ContaEstudantil;
	import entities.ContaPoupanca;

	public class Executable{
		static String slogan="| ---- Global system ----- |";
		static String name="BancoG6";
		static char escolheTipoConta;
		static int day;
		static double valorMovimento=0.00;
		static String tipoTransacao;
		static String continuar;
		
		public static void main(String[] args) {
			
			//Instâncias
			ContaPoupanca cp1 = new ContaPoupanca("222.222.222-72",1,5);
			ContaCorrente cc1 = new ContaCorrente("222.222.222-72",1);
			ContaEspecial cesp1 = new ContaEspecial("222.222.222-72",1,5);
			ContaEmpresa cemp1 = new ContaEmpresa("222.222.222-72",1);
			ContaEstudantil cestu1 = new ContaEstudantil("222.222.222-72",1,5);
			
			//Função Cabeçalho
			cabecalho();
			listaTipoConta();
			leCodigoConta();

				for(int x=0; x<10; ++x){	
					System.out.println("MOVIMENTO "+x);	
					
					//CONTA 1
					if(escolheTipoConta == '1'){
						cabecalho();
						
						System.out.println("CONTA POUPANÇA");
						System.out.println("SALDO ATUAL: R$"+cp1.getSaldo());
						tipoTransacao();
						if("d".equalsIgnoreCase(tipoTransacao)){
							leValorMovimento();
							continuar();
							if("n".equalsIgnoreCase(continuar)){
								System.out.println("Até breve!");
								break;
							}
							
						}else if("c".equalsIgnoreCase(tipoTransacao)){
							leValorMovimento();
							continuar();
							if("n".equalsIgnoreCase(continuar)){
								System.out.println("Até breve!");
								break;
							}
						}else {
							System.out.println("Digitou merda!");
						}
					
					}//CONTA 2
					else if (escolheTipoConta == '2'){
						
					}//CONTA 3
					else if (escolheTipoConta == '3'){
						
					}//CONTA 4
					else if (escolheTipoConta == '4'){
						
					}//CONTA 5
					else if (escolheTipoConta == '5'){
						
					}
					
					
				}
			
			}
		
		
		public static void continuar(){
			Scanner mySc = new Scanner(System.in);
			System.out.println("Continuar S/N: _");
			continuar = mySc.next();
		}
		public static void tipoTransacao() {
			Scanner mySc = new Scanner(System.in);
			System.out.println("MOVIMENTO - D-debito ou C-Crédito: _");
			tipoTransacao = mySc.next();
		}
		
		public static void leValorMovimento() {
			Scanner mySc = new Scanner(System.in);
			System.out.println("Valor movimento: R$ _");
			valorMovimento = mySc.nextDouble();
			
		}
		
		public static void listaTipoConta(){
			System.out.println("TIPOS DE CONTAS:");
			System.out.println("1 - CONTA POUPANÇA");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR\n");
			
			
			
			
		}
		
		public static void leCodigoConta(){
			Scanner mySc = new Scanner(System.in);
			System.out.println("DIGITE O CODIGO DA CONTA : ");
			escolheTipoConta = mySc.next().charAt(0);
		}
		
		public static void cabecalho(){
			System.out.println(""+slogan+"");
			System.out.println("| ------- "+name+" -------- |\n");
			System.out.println("");
		}
		
		

	}
