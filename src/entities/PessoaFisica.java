package entities;

public class PessoaFisica extends Pessoa {
	private Double rendaAnual;
	private Double gastosSaude;
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name);
		this.rendaAnual = rendaAnual;
		this.gastosSaude = gastosSaude;
		
	}
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	public Double getGastosSaude() {
		return gastosSaude;
	}
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	@Override
	public double tax() {
		double tax = 0;
		if (rendaAnual <= 19999) {
			tax += (rendaAnual * 15/100) - (gastosSaude * 50/100);
		}
		else{
			tax += (rendaAnual * 25/100) - (gastosSaude * 50/100);
		}
		return tax;
	}
}
