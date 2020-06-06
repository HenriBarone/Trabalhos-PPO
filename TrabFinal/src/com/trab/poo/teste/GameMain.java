package com.trab.poo.teste;

import java.util.Optional;

import com.trab.poo.dao.Dao;
import com.trab.poo.dao.GameDao;
import com.trab.poo.entidade.Game;

public class GameMain {

	private static Dao<Game> gameDao;

	public static void main(String[] args) {

		gameDao = new GameDao();

		Game game1 = getGame(0);
		// System.out.println(game1);
		gameDao.atualizar(game1, new String[] { "Diablo 3 Alterado", "Blizzard Alterada" });

		Game game2 = getGame(1);

		gameDao.Salvar(new Game("Cyberpunk 2077", "CD Projekt RED"));

		gameDao.deletar(game2);

		gameDao.buscarTodos().forEach(games -> System.out.println(games.getNome()));

	}

	private static Game getGame(long id) {
		Optional<Game> game = gameDao.buscar(id);

		return game.orElseGet(() -> new Game("non-existing game", "no-producer"));

	}

}
