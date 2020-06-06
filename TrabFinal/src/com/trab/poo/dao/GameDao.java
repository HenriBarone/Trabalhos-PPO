package com.trab.poo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.trab.poo.entidade.Game;

public class GameDao implements Dao<Game> {

	public List<Game> games = new ArrayList<>();

	public GameDao() {
		games.add(new Game("Mortal Kombat X", "Nether Helm"));
		games.add(new Game("Diablo 3", "Blizzard"));
	}

	@Override
	public Optional<Game> buscar(long id) {
		return Optional.ofNullable(games.get((int) id));
	}

	@Override
	public List<Game> buscarTodos() {
		return games;
	}

	@Override
	public void Salvar(Game gamesEviado) {
		games.add(gamesEviado);

	}

	@Override
	public void atualizar(Game gamesEviado, String[] params) {
		gamesEviado.setNome(Objects.requireNonNull(params[0], "O campo 'NOME' deve ser preenchido"));
		gamesEviado.setProdutora(Objects.requireNonNull(params[1], "O campo 'PRODUTORA' deve ser prenchido"));

		games.add(gamesEviado);

	}

	@Override
	public void deletar(Game gamesEviado) {
		games.remove(gamesEviado);

	}

}
