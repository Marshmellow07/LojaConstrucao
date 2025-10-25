package br.com.lojaconstrucao.service;

import br.com.lojaconstrucao.model.Pedido;
import br.com.lojaconstrucao.repository.Repository;
import java.util.List;

public class PedidoService {
    private Repository<Pedido> repository;

    public PedidoService(Repository<Pedido> repository) {
        this.repository = repository;
    }

    public void cadastrarPedido(Pedido pedido) {
        repository.salvar(pedido);
    }

    public Pedido buscarPedido(int id) {
        return repository.buscarPorId(id);
    }

    public List<Pedido> listarPedidos() {
        return repository.listarTodos();
    }
}
