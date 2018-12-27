package model.entities;

public class PessoaJuridica extends Contribuinte{
	
	public Integer qtdfuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer qtdfuncionarios) {
		super(nome, renda);
		this.qtdfuncionarios = qtdfuncionarios;
	}

	public Integer getQtdfuncionarios() {
		return qtdfuncionarios;
	}

	public void setQtdfuncionarios(Integer qtdfuncionarios) {
		this.qtdfuncionarios = qtdfuncionarios;
	}
	
	@Override
	public Double impostoDevido() {
		if(qtdfuncionarios > 10) {
			return renda * 0.14;
		}else {
			return renda * 0.15;
		}
	}
	
	@Override
	public String demosntrativo() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome+": $"+impostoDevido());
		return sb.toString();
	}
}
