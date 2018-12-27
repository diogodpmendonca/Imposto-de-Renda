package model.entities;

public abstract class Contribuinte {
	
	protected String nome;
	protected Double renda;
	
	public Contribuinte() {
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public Double impostoDevido() {
		return 0.00;
	}
	
	public String demosntrativo() {
		return "";
	}
}