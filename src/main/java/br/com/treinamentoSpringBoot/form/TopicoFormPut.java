package br.com.treinamentoSpringBoot.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.treinamentoSpringBoot.model.Topico;
import br.com.treinamentoSpringBoot.repository.TopicoRepository;


public class TopicoFormPut {
	
	@NotNull @NotEmpty @Min(5)
	private String titulo;
	
	@NotNull @NotEmpty @Min(10)
	private String mensagem;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getOne(id);
		
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		
		return topico;
	}
	
}
