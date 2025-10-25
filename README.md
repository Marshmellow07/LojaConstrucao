# Loja de Materiais de Construção (Versão Web Refatorada)

🏗️ LojaConstrucaoWebRefatorado

Autor: Gabriel Fadoni Marzanatti
Descrição: Projeto refatorado da loja de materiais de construção, migrado da versão desktop para uma estrutura organizada em pacotes Java, aplicando princípios SOLID e separando Model, Repository e Service.

📂 Estrutura do Projeto
LojaConstrucaoWebRefatorado/
 ├── src/br/com/lojaconstrucao/model/      # Classes de domínio (Produto, Cliente, Pedido, ItemPedido, Pagamento)
 ├── src/br/com/lojaconstrucao/repository/ # Interfaces e repositórios em memória
 ├── src/br/com/lojaconstrucao/service/    # Serviços com regras de negócio
 ├── src/br/com/lojaconstrucao/app/        # Classe MainTeste para simular execução
 ├── docs/                                 # Documentação: relatorio.md e evidencias.md
 ├── .gitignore
 └── README.md

⚙️ Como executar

Abra o projeto no NetBeans.

Compile todos os pacotes com Clean and Build.

Execute a classe MainTeste.java.

Observe a saída no console para validar os fluxos de cadastro de produto, cliente e pedido.

Exemplo de saída:

Pedido cadastrado para: Gabriel Fadoni
Total do pedido: R$192.5

✅ Funcionalidades

Cadastro de Produtos com validação de preço e estoque.

Cadastro de Clientes com validação de nome.

Criação de Pedidos com múltiplos itens.

Cálculo automático do total do pedido.

Simulação de pagamento para validação de valores pagos.

Sistema organizado seguindo princípios SOLID e separação de responsabilidades.

📝 Documentação

Relatório da Etapa 6: docs/relatorio.md

Evidências de commits: docs/evidencias.md

📌 GitHub

Todos os commits podem ser verificados via:

git log --oneline