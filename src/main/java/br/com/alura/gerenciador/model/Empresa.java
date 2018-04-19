package br.com.alura.gerenciador.model;

public class Empresa {

	private Long id = 0L;
	private String nome;

	public Empresa(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(long id) {
		this.id = id;
		
	}

}
