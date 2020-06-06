package com.trab.poo.entidade;

public class Game {

	Integer id;

	String nome;
	String produtora;
	String designers;
	String engine;
	String plataformas;
	String genero;
	String lançamento;
	String gameMode;

	public Game() {

	}

	public Game(String gameName, String gameProdutora) {
		setNome(gameName);
		setProdutora(gameProdutora);
	}

	public void cadastrarProdutora(String gameProdutora) {
		setProdutora(gameProdutora);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getDesigners() {
		return designers;
	}

	public void setDesigners(String designers) {
		this.designers = designers;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(String plataformas) {
		this.plataformas = plataformas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getLançamento() {
		return lançamento;
	}

	public void setLançamento(String lançamento) {
		this.lançamento = lançamento;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

}
