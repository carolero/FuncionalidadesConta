package br.com.zup.modelo;

public interface ContaInterface {
	
	// Assinatura
	void depositoEmConta(double valorDeposito);
	void saqueConta (int valorSaque);
	void mostrarSaldo (double saldoEmConta);
	void transferencia (double valorTransferencia, Conta contaLeo, Conta contaAngelica);

}
