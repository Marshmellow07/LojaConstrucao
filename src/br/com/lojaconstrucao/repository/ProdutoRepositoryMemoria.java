package br.com.lojaconstrucao.repository;

import br.com.lojaconstrucao.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositoryMemoria implements Repository<Produto> {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void salvar(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Produto buscarPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Produto> listarTodos() {
        return produtos;
    }
}
