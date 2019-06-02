package br.com.zup.modelo;

import java.util.Scanner;

public class Brasileiro extends Pessoa implements ContaInterface {
	
	private String idioma;
	private boolean gostaFeijoada;
	private Conta conta;
	
	
	// Construtor
	public Brasileiro(String nome, String sobrenome, int idade, String idioma, boolean gostaFeijoada, Conta conta) {
		super(nome, sobrenome, idade);
		this.idioma = idioma;
		this.gostaFeijoada = gostaFeijoada;
		this.conta = conta;
	}
	
	// Get & Set
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isGostaFeijoada() {
		return gostaFeijoada;
	}

	public void setGostaFeijoada(boolean gostaFeijoada) {
		this.gostaFeijoada = gostaFeijoada;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	// toString
	public String toString() {
		String modelo = "";
		
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome - >" + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "Idioma -> " + this.getIdioma() + "\n";
		modelo += "Gosta de feijoada? " + this.isGostaFeijoada() + "\n";
		modelo += "Conta bancária: " + this.getConta () + "\n";
		
		return modelo;
	}
	
	// Implementando métodos
	@Override
	public void depositoEmConta(double valorDeposito) {
		
		double valorTotal = conta.getSaldo() + valorDeposito;
		conta.setSaldo(valorTotal);
		System.out.println("Depósito efetuado com sucesso. Seu saldo atual é de R$" + valorTotal);

	}

	@Override
	public void saqueConta(int valorSaque) {
		
		if (conta.getSaldo() >= valorSaque) {
			
			double valorFinal = conta.getSaldo() - valorSaque;
			conta.setSaldo(valorFinal);
			
			System.out.println("Seu saque foi bem sucedido.");
			System.out.println("Seu saldo atual agora é R$" + valorFinal);
			
		} else {
			System.out.println("Seu saldo é insuficiente para realizar este saque");
		}
		
	}

	@Override
	public void mostrarSaldo(double saldoEmConta) {
		
		double saldo = conta.getSaldo();
		System.out.println("Seu saldo é de: " + saldo);

	}

	@Override
	public void transferencia(double valorTransferencia, Conta conta1, Conta conta2) {
//			double saldo = conta.getSaldo();
			if(conta1.getSaldo() >= valorTransferencia) {
				double pegarSaldoConta1 = conta1.getSaldo();
				double pegarSaldoConta2 = conta2.getSaldo();
				
				double saldoTotal1 = pegarSaldoConta1 - valorTransferencia;
				double saldoTotal2 = pegarSaldoConta2 + valorTransferencia;
				
				conta1.setSaldo(saldoTotal1);
				conta2.setSaldo(saldoTotal2);
				
				System.out.println("Sua transferência foi efetuada com sucesso.\nSeu saldo atual é de R$" + saldoTotal1);
				// Para confirmar a transação
				System.out.println("Saldo atual da segunda conta é de R$" + saldoTotal2);
							
			} else {
				System.out.println("Seu saldo não é suficiente para realizar a transferência.");
			}
			
	}
	
	
	
}
