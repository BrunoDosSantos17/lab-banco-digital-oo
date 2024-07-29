package TransacaoBancaria.model;

import java.util.List;

import TransacaoBancaria.service.Conta;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class Banco {

	private String nome;
	private List<Conta> contas;
}
