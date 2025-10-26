Relatório – Etapa 6

Projeto: Sistema de Controle de Loja de Materiais de Construção
Aluno: Gabriel Fadoni Marzanatti
Data: 25/10/2025

1. Introdução

Nesta etapa do projeto, o sistema recebeu melhorias e refatorações em classes já existentes, além da implementação de novas funcionalidades que permitem um controle mais eficiente de pedidos, produtos e pagamentos. O foco foi garantir consistência na estrutura do código, otimizar métodos e consolidar a integração com o banco de dados MySQL.

Tecnologias utilizadas: Java (NetBeans), MySQL, JDBC, Git/GitHub.

2. Objetivos da Etapa 6

Refatorar classes existentes para melhorar legibilidade e manutenção.

Implementar funcionalidades adicionais de cadastro e controle de estoque.

Garantir que todos os métodos relacionados a pedidos e produtos estejam funcionando corretamente.

Testar e gerar evidências de que o sistema está operando conforme o esperado.

3. Metodologia

Revisão das classes Java existentes (Cliente, Produto, Pedido, Pagamento).

Refatoração de métodos repetitivos e melhoria de validações.

Criação de métodos auxiliares para facilitar a manutenção do sistema.

Testes manuais de cadastro, atualização e exclusão de registros.

Documentação das evidências em prints e registros de logs.

4. Estrutura do Sistema (Etapa 6)

Pacotes e classes implementadas/refatoradas:

Pacote	Classe	Descrição
model	Cliente.java	Representa clientes, com atributos e métodos de cadastro e consulta.
model	Produto.java	Representa produtos, incluindo controle de estoque e validação de quantidade.
model	Pedido.java	Gerencia pedidos realizados, cálculo de total e associação de produtos.
model	Pagamento.java	Registra pagamentos, valida pagamentos pendentes e atualiza status de pedidos.
dao	ClienteDAO.java	Implementa acesso ao banco de dados para clientes.
dao	ProdutoDAO.java	Implementa acesso ao banco de dados para produtos.
dao	PedidoDAO.java	Implementa acesso ao banco de dados para pedidos.
dao	PagamentoDAO.java	Implementa acesso ao banco de dados para pagamentos.
controller	LojaController.java	Contém métodos que integram classes model e dao, controlando a lógica do sistema.
5. Implementação
5.1 Cadastro de Produto
public boolean cadastrarProduto(Produto p) {
    if(p.getNome().isEmpty() || p.getPreco() <= 0) {
        return false;
    }
    return ProdutoDAO.salvar(p);
}


Valida nome e preço do produto.

Chama o DAO para salvar no banco de dados.

5.2 Registro de Pedido
public boolean registrarPedido(Pedido pedido) {
    if(pedido.getProdutos().isEmpty()) {
        return false;
    }
    pedido.calcularTotal();
    return PedidoDAO.salvar(pedido);
}


Garante que o pedido tenha produtos.

Calcula o valor total do pedido antes de salvar.

5.3 Pagamento
public boolean registrarPagamento(Pagamento pagamento) {
    if(pagamento.getValor() <= 0) return false;
    pagamento.setStatus("PAGO");
    return PagamentoDAO.salvar(pagamento);
}


Confere se o valor é positivo.

Atualiza status do pagamento.

6. Testes e Evidências

Testes realizados:

Cadastro de clientes, produtos e pedidos.

Atualização de estoque após vendas.

Registro de pagamentos e alteração de status de pedidos.

Evidências:

Prints das telas de cadastro de produtos, clientes e pedidos funcionando.

Logs do sistema mostrando inserção no banco de dados.

Obs.: Para cada método testado, o sistema salvou corretamente os registros no MySQL, garantindo que a Etapa 6 foi concluída com sucesso.

7. Conclusão

A Etapa 6 foi concluída com êxito. As principais melhorias incluem:

Refatoração de métodos repetitivos.

Controle de estoque integrado ao registro de pedidos.

Validações mais consistentes nos cadastros de produtos, clientes e pagamentos.

Integração completa entre as classes de modelo e os DAOs.

O sistema agora apresenta maior estabilidade, legibilidade e facilidade de manutenção, atendendo aos objetivos da etapa.

8. Referências

DEITEL, H. “Java Como Programar”, 11ª edição.

Documentação oficial Java: https://docs.oracle.com/en/java/

MySQL Documentation: https://dev.mysql.com/doc/

Apostilas e material do curso de programação.