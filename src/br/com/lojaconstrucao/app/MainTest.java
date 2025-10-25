package br.com.lojaconstrucao.app;

import br.com.lojaconstrucao.model.*;
import br.com.lojaconstrucao.repository.*;
import br.com.lojaconstrucao.service.*;

public class MainTeste {
    public static void main(String[] args) {
        ProdutoRepositoryMemoria produtoRepo = new ProdutoRepositoryMemoria();
        ClienteRepositoryMemoria clienteRepo = new ClienteRepositoryMemoria();
        PedidoRepositoryMemoria pedidoRepo = new PedidoRepositoryMemoria();

        ProdutoService produtoService = new ProdutoService(produtoRepo);
        ClienteService clienteService = new ClienteService(clienteRepo);
        PedidoService pedidoService = new PedidoService(pedidoRepo);

        // Criar produto
        Produto cimento = new Produto(1, "Cimento CP-II", 38.50, 50);
        produtoService.cadastrarProduto(cimento);

        // Criar cliente
        Cliente cliente = new Cliente(1, "Gabriel Fadoni", "19999999999");
        clienteService.cadastrarCliente(cliente);

        // Criar pedido
        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarItem(new ItemPedido(cimento, 5));
        pedidoService.cadastrarPedido(pedido);

        System.out.println("Pedido cadastrado para: " + pedido.getCliente().getNome());
        System.out.println("Total do pedido: R$" + pedido.calcularTotal());
    }
}
