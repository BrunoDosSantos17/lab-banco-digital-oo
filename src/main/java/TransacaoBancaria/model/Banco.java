package TransacaoBancaria.model;

import TransacaoBancaria.service.Conta;
import lombok.*;

import java.util.List;


@Getter
@Setter
public class Banco {

	private String nomeBanco;

	private List<Conta> contas;

	private Cliente cliente;


}
