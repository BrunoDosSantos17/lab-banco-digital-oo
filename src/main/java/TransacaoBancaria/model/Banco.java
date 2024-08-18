package TransacaoBancaria.model;

import java.util.List;

import TransacaoBancaria.controller.ContaCorrente;
import TransacaoBancaria.service.Conta;
import lombok.*;


public class Banco {

	@Getter
	private String nomeBanco;

	@Getter
	private Conta contas;

	private String nomeUsuarioCadastro;

	private String sobrenomeUsuarioCadatro;

	private String ruaUsuarioCadastro;

	public Banco(String nome, String nomeUsuario, String sobrenomeUsuario, String ruaUsuario) {
		nomeBanco = nome;
		nomeUsuarioCadastro = nomeUsuario;
		sobrenomeUsuarioCadatro = sobrenomeUsuario;
		ruaUsuarioCadastro = ruaUsuario;
		contas = new ContaCorrente();
	}

	public void deposita() {
		contas.
	}



}
