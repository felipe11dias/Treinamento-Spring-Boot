package br.com.treinamentoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamentoSpringBoot.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
	Curso findByNome(String nomeCurso);
	
}
