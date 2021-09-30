package com.mygamestore.gamestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mygamestore.gamestore.model.Categoria;
import com.mygamestore.gamestore.model.Produto;

@Repository
	public interface ProdutoRepository extends JpaRepository<Produto, Long> {

		public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
		
		public List<Produto> findAllByCategoria(Categoria categoria);
		
	}

