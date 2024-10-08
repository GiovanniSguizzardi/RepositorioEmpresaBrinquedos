# RepositorioEmpresaBrinquedos
FunToy é uma aplicação web desenvolvida em Java com Spring Boot para a gestão de um inventário de brinquedos. A aplicação permite que os usuários adicionem, editem, visualizem e excluam brinquedos, mantendo um registro detalhado de informações importantes como nome, tipo, classificação, tamanho, preço e descrição de cada brinquedo. Além disso, a aplicação agora gerencia fornecedores dos brinquedos, possibilitando a adição, edição e listagem de fornecedores.

- RM551261 - Giovanni Sguizzardi
- RM98057 - Nicolas E. Inohue
- RM99841 - Marcel Prado
- IDE UTILIZADA: IntelliJ

## 🔗 Links
- Link do Site Hospedado: [Link Site-Hospedado](https://repositorioempresabrinquedos.onrender.com/listar)
- Link do REPOSITÓRIO: [Link Repositório](https://github.com/GiovanniSguizzardi/RepositorioEmpresaBrinquedos.git)

## 📜 Documentação
Foram criados dentro da aplicação métodos para consulta, criação e exclusão de dados tanto para brinquedos quanto para fornecedores. Abaixo estão os principais endpoints disponíveis:

### Endpoints para Brinquedos:
- **/listar**: Lista todos os brinquedos cadastrados.
- **/descricao/{id}**: Exibe a descrição detalhada de um brinquedo específico.
- **/adicionar**: Exibe o formulário para adicionar ou editar brinquedos.
- **/editar/{id}**: Exibe o formulário para editar um brinquedo existente.
- **/excluir/{id}**: Exclui um brinquedo do inventário.

### Endpoints para Fornecedores:
- **/fornecedores**: Lista todos os fornecedores cadastrados.
- **/fornecedor/adicionar**: Exibe o formulário para adicionar ou editar fornecedores.
- **/fornecedor/editar/{id}**: Exibe o formulário para editar um fornecedor existente.
- **/fornecedor/excluir/{id}**: Exclui um fornecedor cadastrado.

## 🗃️ Estrutura de Dados

### Tabela Brinquedo:
| Atributo ORACLE            | Atributo JAVA          |
| -------------------------- | ---------------------- |
| ID (NUMBER)                | id (Long)              |
| NOME (VARCHAR2)            | nome (String)          |
| DESCRICAO (VARCHAR2)       | descricao (String)     |
| TIPO (VARCHAR2)            | tipo (String)          |
| CLASSIFICACAO (VARCHAR2)   | classificacao (String) |
| TAMANHO (NUMBER)           | tamanho (Double)       |
| PRECO (NUMBER)             | preco (Double)         |
| FORNECEDOR_ID (NUMBER)     | fornecedor (Fornecedor)|

### Tabela Fornecedor:
| Atributo ORACLE            | Atributo JAVA          |
| -------------------------- | ---------------------- |
| ID (NUMBER)                | id (Long)              |
| NOME (VARCHAR2)            | nome (String)          |
| ENDERECO (VARCHAR2)        | endereco (String)      |
| TELEFONE (VARCHAR2)        | telefone (String)      |

## 🆕 Novas Funcionalidades:
1. **Gerenciamento de Fornecedores**: Agora, além de gerenciar brinquedos, é possível adicionar, editar e excluir fornecedores que fornecem os brinquedos.
2. **Relacionamento Brinquedo-Fornecedor**: Cada brinquedo pode estar associado a um fornecedor, facilitando a gestão do inventário por fornecedor.

## 🛠️ Configuração do Projeto:
Para rodar o projeto localmente, siga os seguintes passos:

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/GiovanniSguizzardi/RepositorioEmpresaBrinquedos.git
