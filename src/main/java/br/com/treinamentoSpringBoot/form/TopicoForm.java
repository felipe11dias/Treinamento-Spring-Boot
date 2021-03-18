package br.com.treinamentoSpringBoot.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.treinamentoSpringBoot.model.Topico;
import br.com.treinamentoSpringBoot.repository.CursoRepository;

public class TopicoForm {
	
	@NotNull @NotEmpty @Min(5)
	private String titulo;
	
	@NotNull @NotEmpty @Min(10)
	private String mensagem;
	
	@NotNull @NotEmpty
	private String nomeCurso;
	
	
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
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public Topico converter(CursoRepository repository) {
		return new Topico(titulo, mensagem, repository.findByNome(nomeCurso));
	}
	
}
