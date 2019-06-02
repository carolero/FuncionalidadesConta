package br.com.zup.modelo;

public class Conta {
	
	// Atributos
	private String numeroConta;
	private String banco;
	private String agencia;
	private double saldo;
	
	// Construtor
	public Conta(String numeroConta, String banco, String agencia, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	// Get & Set
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//toString
	public String toString() {
		
		String modelo = "";
		
		modelo += "\n -Número da conta -> " + this.getNumeroConta() + "\n";
		modelo += " -Banco -> " + this.getBanco() + "\n";
		modelo += " -Agência -> " + this.getAgencia() + "\n";
		modelo += " -Saldo -> " + this.getSaldo() + "\n";
		
		return modelo;
	}	
	

}
