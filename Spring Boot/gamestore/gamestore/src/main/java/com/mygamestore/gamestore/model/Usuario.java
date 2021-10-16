package com.mygamestore.gamestore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
 
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size (min= 2, max =100)
	private String nome;
	
	@NotNull
	@Size  (min= 5, max =100)
	private String usuario;
	
	@NotNull
	@Size (min= 5, max =100)
	private String senha;
	
	@OneToMany(mappedBy="usuario",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Categoria> categoria;
	public Usuario(long id, @NotNull String nome, String usuario, String senha) {

        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        
    }
	public Usuario() {}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;

		
	}
	
	
	
}

