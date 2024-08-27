package TransacaoBancaria;

import TransacaoBancaria.model.Banco;
import TransacaoBancaria.model.Cliente;
import TransacaoBancaria.service.BancoService;

public class Main {


    public static void main(String[] args) {
        Cliente user = new Cliente("Bruno", "dos Santos", "Rua Rudolfo Walter");
        BancoService bancoService = new BancoService("BB", user);

        bancoService.deposita(100, "CC");
        bancoService.infoBancaria();
        bancoService.deposita(100, "CP");
        bancoService.infoBancaria();

        bancoService.sacar(100, "CC");
        bancoService.infoBancaria();


    }
}
