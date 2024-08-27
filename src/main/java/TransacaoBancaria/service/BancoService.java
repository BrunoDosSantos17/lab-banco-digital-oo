package TransacaoBancaria.service;

import TransacaoBancaria.model.Banco;
import TransacaoBancaria.model.Cliente;


import java.util.List;

public class BancoService {
    Banco banco;

    public BancoService(String nome, Cliente cliente) {
        banco = new Banco();
        banco.setNomeBanco(nome);
        banco.setCliente(cliente);
        banco.setContas(List.of(new ContaCorrente(), new ContaPoupanca())); // Adicionando a Conta Poupança
    }

    public void deposita(Integer valor, String tipoConta) {
        if ("CC".equals(tipoConta)) {
            for (Conta conta : banco.getContas()) {
                if (conta instanceof ContaCorrente) {
                    conta.setSaldo(conta.getSaldo() + valor);
                    System.out.println("Depósito de " + valor + " na Conta Corrente bem-sucedido.");
                    return;
                }
            }
            System.out.println("Nenhuma Conta Corrente encontrada.");
        } else if ("CP".equals(tipoConta)) {  // Tratamento para Conta Poupança
            for (Conta conta : banco.getContas()) {
                if (conta instanceof ContaPoupanca) {
                    conta.setSaldo(conta.getSaldo() + valor);
                    System.out.println("Depósito de " + valor + " na Conta Poupança bem-sucedido.");
                    return;
                }
            }
            System.out.println("Nenhuma Conta Poupança encontrada.");
        } else {
            System.out.println("Tipo de conta não suportado.");
        }
    }

    public void sacar(Integer valor, String tipoConta) {
        if ("CC".equals(tipoConta)) {
            for (Conta conta : banco.getContas()) {
                if (conta instanceof ContaCorrente) {
                    if (conta.getSaldo() >= valor) {
                        conta.setSaldo(conta.getSaldo() - valor);
                        System.out.println("Saque de " + valor + " na Conta Corrente bem-sucedido.");
                    } else {
                        System.out.println("Saldo insuficiente na Conta Corrente.");
                    }
                    return;
                }
            }
            System.out.println("Nenhuma Conta Corrente encontrada.");
        } else if ("CP".equals(tipoConta)) {  // Tratamento para Conta Poupança
            for (Conta conta : banco.getContas()) {
                if (conta instanceof ContaPoupanca) {
                    if (conta.getSaldo() >= valor) {
                        conta.setSaldo(conta.getSaldo() - valor);
                        System.out.println("Saque de " + valor + " na Conta Poupança bem-sucedido.");
                    } else {
                        System.out.println("Saldo insuficiente na Conta Poupança.");
                    }
                    return;
                }
            }
            System.out.println("Nenhuma Conta Poupança encontrada.");
        } else {
            System.out.println("Tipo de conta não suportado.");
        }
    }

    public void infoBancaria() {
        System.out.println("Informações Bancárias:");
        System.out.println("Nome do Banco: " + banco.getNomeBanco());
        for (Conta conta : banco.getContas()) {
            conta.imprimirInfosComuns();
        }
    }


}
