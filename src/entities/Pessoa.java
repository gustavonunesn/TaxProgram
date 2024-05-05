package entities;

public abstract class Pessoa {
	protected String name;
	protected Double tax;

	public Pessoa(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract double tax();
}