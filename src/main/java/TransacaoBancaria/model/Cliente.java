package TransacaoBancaria.model;


import lombok.*;


@RequiredArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Cliente {

	@NonNull
	private String name;
	@NonNull
	private String lastName;
	@NonNull
	private String street;

	Banco banco;

	public String cadastrarNoBanco(String nomeBanco) {
		banco = new Banco(nomeBanco, name, lastName, street);
		return "Cadastro bem sucedido";
	}







}
