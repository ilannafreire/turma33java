package classes;

public class Funcionario {

	// Atributos
	private String matriculs;
	private int horasTrabalhadas;
	private double valorHora;
	private String nome;

	// Contrutores
	public Funcionario(String matriculs, String nome) {
		super();
		this.matriculs = matriculs;
		this.nome = nome;
	}

	public Funcionario(String matriculs, int horasTrabalhadas, double valorHora, String nome) {
		super();
		this.matriculs = matriculs;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.nome = nome;
	}
	//Encapsulamento

	public String getMatriculs() {
		return matriculs;
	}

	public void setMatriculs(String matriculs) {
		this.matriculs = matriculs;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
 //metodos
	public double salario(int valor) {
		this.horasTrabalhadas = horasTrabalhadas * valor;
		return(horasTrabalhadas * valor);
	}
}
