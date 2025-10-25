package br.com.lojaconstrucao.repository;

import java.util.List;

public interface Repository<T> {
    void salvar(T entidade);
    T buscarPorId(int id);
    List<T> listarTodos();
}
