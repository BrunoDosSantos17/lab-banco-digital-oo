package TransacaoBancaria;

import TransacaoBancaria.model.Cliente;
import TransacaoBancaria.service.Conta;
import TransacaoBancaria.controller.ContaCorrente;
import TransacaoBancaria.controller.ContaPoupanca;

public class Main {


    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(100, poupanca);


        poupanca.imprimirExtrato();
    }
}
