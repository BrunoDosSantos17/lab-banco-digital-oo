package TransacaoBancaria.controller;

import TransacaoBancaria.model.Cliente;
import TransacaoBancaria.repository.IConta;
import TransacaoBancaria.service.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}


	@Override
	public void sacar(double valor) {

	}

	@Override
	public void depositar(double valor) {

	}

	@Override
	public void transferir(double valor, IConta contaDestino) {

	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}
