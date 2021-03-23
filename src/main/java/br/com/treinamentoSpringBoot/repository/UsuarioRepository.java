package br.com.treinamentoSpringBoot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamentoSpringBoot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email);

}
