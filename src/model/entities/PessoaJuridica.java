package model.entities;

public class PessoaJuridica extends Contribuinte{
	
	public Integer qtdfuncionarios;

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
			return getRenda() * 0.14;
		}else {
			return getRenda() * 0.15;
		}
	}
	
	@Override
	public String demosntrativo() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome()+": $"+impostoDevido());
		return sb.toString();
	}
}
