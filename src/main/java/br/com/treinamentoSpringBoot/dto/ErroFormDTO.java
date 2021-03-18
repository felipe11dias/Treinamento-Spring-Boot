package br.com.treinamentoSpringBoot.dto;

public class ErroFormDTO {
	
	private String campo;
	private String erro;
	
	public ErroFormDTO(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
}

