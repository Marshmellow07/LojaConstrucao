package br.com.lojaconstrucao.repository;

import br.com.lojaconstrucao.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryMemoria implements Repository<Cliente> {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorId(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Cliente> listarTodos() {
        return clientes;
    }
}
