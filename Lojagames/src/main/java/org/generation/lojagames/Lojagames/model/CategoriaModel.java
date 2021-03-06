package org.generation.lojagames.Lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	@NotNull
	@Size(min = 1 , max = 30)
	private String genero;
	
	
	@NotNull
	private String versao;
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	
	public String getVersao() {
		return versao;
	}


	public void setVersao(String versao) {
		this.versao = versao;
	}


	public List<ProdutoModel> getProduto() {
		return produto;
	}


	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}

}