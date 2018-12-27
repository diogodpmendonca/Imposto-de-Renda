package model.entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double impostoDevido() {
		if(renda < 20000.00) {
			return renda * 0.15 - gastoSaude * 0.5;
		}else {
			return renda * 0.25 - gastoSaude * 0.5;
		}
	}
	
	@Override
	public String demosntrativo() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome+": $"+impostoDevido());
		return sb.toString();
	}
}
