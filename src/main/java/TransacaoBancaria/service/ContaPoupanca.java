package TransacaoBancaria.service;

import TransacaoBancaria.repository.IConta;

public class ContaPoupanca extends Conta {
    @Override
    public void sacar(double valor) {
        if(super.getSaldo() > valor ) {
            super.setSaldo((valor * -1));
            System.out.println("Saque de " + valor + " bem sucedido");
        }else {
            System.out.println("Saque não realizado, valor maior que: " + super.getSaldo());
        }
    }

    @Override
    public void depositar(double valor) {
        super.setSaldo(valor);
        System.out.println("Deposito de " + valor + " bem sucedido");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    public void jurosCompostos(Integer tempo) {
        Double rendimento = Math.pow(super.getSaldo() * (1 + 0.08), tempo) - super.getSaldo();

        super.setSaldo(rendimento);

    }
}
