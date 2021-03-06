package br.com.treinamentoSpringBoot.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.treinamentoSpringBoot.model.Topico;

public class TopicoDTO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	public TopicoDTO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static Page<TopicoDTO> converter(Page<Topico> topicos) {
		return topicos.map(TopicoDTO::new);
	}
	
	
}
