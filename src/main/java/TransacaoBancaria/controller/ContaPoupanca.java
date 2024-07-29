package TransacaoBancaria.controller;

import TransacaoBancaria.model.Cliente;
import TransacaoBancaria.service.Conta;
import TransacaoBancaria.repository.IConta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}


	public void sacar(double valor) {
	}

	public void depositar(double valor) {
	}

	public void transferir(double valor, IConta contaDestino) {
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
