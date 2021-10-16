package com.mygamestore.gamestore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mygamestore.gamestore.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);
    public Usuario findByNome(String nome);
    public List<Usuario> findAllByNomeContaningIgnoreCase(String nome);
}
