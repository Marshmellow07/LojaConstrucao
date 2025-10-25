package br.com.lojaconstrucao.service;

import br.com.lojaconstrucao.model.Produto;
import br.com.lojaconstrucao.repository.Repository;

import java.util.List;

public class ProdutoService {
    private Repository<Produto> repository;

    public ProdutoService(Repository<Produto> repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(Produto produto) {
        if (produto.getPreco() <= 0)
            throw new IllegalArgumentException("Preço inválido!");
        repository.salvar(produto);
    }

    public Produto buscarProduto(int id) {
        return repository.buscarPorId(id);
    }

    public List<Produto> listarProdutos() {
        return repository.listarTodos();
    }
}
