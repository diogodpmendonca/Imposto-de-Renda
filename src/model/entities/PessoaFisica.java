package model.entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastoSaude;

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
		if(getRenda() < 20000.00) {
			return getRenda() * 0.15 - gastoSaude * 0.5;
		}else {
			return getRenda() * 0.25 - gastoSaude * 0.5;
		}
	}
	
	@Override
	public String demosntrativo() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome()+": $"+impostoDevido());
		return sb.toString();
	}
}
