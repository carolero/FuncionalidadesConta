package br.com.zup.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.RepositoryIdHelper;

import br.com.zup.modelo.Brasileiro;
import br.com.zup.modelo.Conta;

public class TestePessoa {

	public static void main(String[] args) {
		
		// Criando lista
		List<Brasileiro> listaPessoas = new ArrayList<Brasileiro>();
		
		//  Primeiro de conta
		Conta conta1 = new Conta("0000-0", "Itaú", "8786", 8500);
		Conta conta2 = new Conta("0001", "Nubank", "0001", 100);
		
		// Criar Brasileiro
		Brasileiro leonardo = new Brasileiro("Leonardo", "Silve", 25, "Português", true, conta1);
		Brasileiro angelica = new Brasileiro("Angelica", "Campos", 19, "Portugês", false, conta2);
		
		listaPessoas.add(leonardo);
		listaPessoas.add(angelica);
		
		for (Brasileiro brasileiro : listaPessoas) {
			System.out.println(brasileiro);
		}
		
		Scanner scan = new Scanner(System.in);
		
		//----------------------------------------------------------------------------------
		/* Para testar cada método separadamente, coloquei eles em comentário*/
		
		// MÉTODO DE DEPOSITO
//		System.out.println("Quanto quer depositar?");
//		double valorDeposito = scan.nextDouble();
//		leonardo.depositoEmConta(valorDeposito);
	
		//----------------------------------------------------------------------------------

		
		// MÉTODO SACAR EM CONTA
//		System.out.println("Quanto quer sacar?");
//		int valorSaque = scan.nextInt();
//		leonardo.saqueConta(valorSaque);
		
		//----------------------------------------------------------------------------------

		
		// MÉTODO MOSTRAR SALDO EM CONTA
//		System.out.println("Consultar saldo em conta?\nSim ou Não");
//		String respostaSaque = scan.next();
//		
//		if (respostaSaque.equalsIgnoreCase("Sim")) {
//			double saldoTotal = conta1.getSaldo();
//			leonardo.mostrarSaldo(saldoTotal);
//		} else {
//			System.out.println("Até a próxima!");
//		}
		
		
		//----------------------------------------------------------------------------------
		
		// MÉTODO DE TRANSFERÊNCIA ENTRE CONTAS
//		System.out.println("Quanto quer transferir?");
//		int valorTransferencia = scan.nextInt();
//		leonardo.transferencia(valorTransferencia, conta1, conta2);
	}

}
