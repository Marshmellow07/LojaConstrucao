package br.com.lojaconstrucao.service;

import br.com.lojaconstrucao.model.Cliente;
import br.com.lojaconstrucao.repository.Repository;
import java.util.List;

public class ClienteService {
    private Repository<Cliente> repository;

    public ClienteService(Repository<Cliente> repository) {
        this.repository = repository;
    }

    public void cadastrarCliente(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty())
            throw new IllegalArgumentException("Nome inválido!");
        repository.salvar(cliente);
    }

    public Cliente buscarCliente(int id) {
        return repository.buscarPorId(id);
    }

    public List<Cliente> listarClientes() {
        return repository.listarTodos();
    }
}
