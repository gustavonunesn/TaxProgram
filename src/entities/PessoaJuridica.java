package entities;

public class PessoaJuridica extends Pessoa {
	private Double pjRendaAnual;
	private Integer funcionarios;
	
	
	public PessoaJuridica(String name, Double pjRendaAnual, Integer funcionarios) {
		super(name);
		this.pjRendaAnual = pjRendaAnual;
		this.funcionarios = funcionarios;
	}


	public Double getPjRendaAnual() {
		return pjRendaAnual;
	}
	public void setPjRendaAnual(Double pjRendaAnual) {
		this.pjRendaAnual = pjRendaAnual;
	}
	public Integer getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}
	@Override
	public double tax() {
		double tax = 0;
		if(funcionarios < 10) {
			tax += pjRendaAnual * 16/100;
		}
		else {
			tax = pjRendaAnual * 14/100;
		}
		return tax;
	}
}
