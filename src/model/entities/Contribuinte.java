package model.entities;

public abstract class Contribuinte {
	
	private String nome;
	private Double String;
	
	public Contribuinte() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getString() {
		return String;
	}

	public void setString(Double string) {
		String = string;
	}
	
	public Double impostoDevido() {
		
		return 0.00;
	}
}
