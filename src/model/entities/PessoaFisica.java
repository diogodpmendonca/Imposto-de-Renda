package model.entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastoSaude;

	public PessoaFisica(Double gastoSaude) {
		super();
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
		if(renda > 20000.00) {
			return renda * 0.15 - gastoSaude;
		}else {
			return renda * 0.25 - gastoSaude;
		}
	}
	
	@Override
	public String demosntrativo() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome+": $"+impostoDevido());
		return sb.toString();
	}
}
