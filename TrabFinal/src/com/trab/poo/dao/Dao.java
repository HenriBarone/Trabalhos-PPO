package com.trab.poo.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<H> {

	Optional<H> buscar(long id);

	List<H> buscarTodos();

	void Salvar(H h);

	void atualizar(H h, String[] params);

	void deletar(H h);

}
