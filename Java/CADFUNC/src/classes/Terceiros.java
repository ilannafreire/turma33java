package classes;

public class Terceiros extends Funcionario implements {
        	
	private double adicional;

	public Terceiros(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public Terceiros(String matricula, int horasTrabalhas, double valorHora, String nome, double adicional) {
		super(matricula, horasTrabalhas, valorHora, nome);
		this.adicional = adicional;
	}

	
	//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	//metodos
	public double salario(int valor) {		
			return (horasTrabalhadas* valor)+adicional;
	} 
}