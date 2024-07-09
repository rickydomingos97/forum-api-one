## ## **API REST de Fórum: Construa sua Comunidade Online**

**Seja bem-vindo ao repositório da API REST de Fórum!** 

Este projeto oferece uma plataforma completa para gerenciar tópicos de discussão e interação entre usuários, ideal para criar comunidades vibrantes e engajadas. Desenvolvido com as melhores tecnologias Java, este projeto é de código aberto e pronto para ser usado, clonado ou modificado de acordo com suas necessidades.

**Tecnologias Utilizadas:**

* **Java 11+:** A linguagem de programação robusta e confiável para desenvolvimento de back-end.
* **Spring Boot:** Framework web poderoso que simplifica a criação de aplicações RESTful.
* **Spring Web:** Biblioteca completa para construir APIs RESTful com Spring.
* **Spring Doc:** Gere documentação OpenAPI automaticamente para sua API.
* **Spring Data JPA:** Simplifique o acesso e a manipulação de dados com JPA e repositórios.
* **Flyway Migrations:** Gerencie suas migrações de banco de dados com facilidade e segurança.
* **Lombok:** Reduza o código repetitivo e melhore a legibilidade com anotações poderosas.
* **Auth0 JWT:** Autenticação e autorização seguras com tokens JSON Web.
* **MySQL:** Banco de dados relacional popular para armazenamento de dados robusto.

**Funcionalidades:**

* **Criação de tópicos:** Os usuários podem criar novos tópicos com título, descrição e tags.
* **Respostas a tópicos:** Permita que os usuários respondam a tópicos existentes, gerando discussões e engajamento.
* **Edição e exclusão de tópicos/respostas:** Dê aos usuários controle sobre seu conteúdo, permitindo a edição e exclusão de seus próprios tópicos e respostas.
* **Sistema de votação:** Implemente um sistema de votação para que os usuários possam curtir ou descurtir tópicos e respostas, promovendo conteúdo relevante.
* **Autenticação e autorização:** Proteja sua API com autenticação JWT e controle de acesso baseado em funções, garantindo a segurança do seu fórum.

**Começando:**

**Pré-requisitos:**

* Java 11+ instalado
* Maven instalado
* Banco de dados MySQL configurado

**Clonando o Repositório:**

```bash
git clone https://github.com/seu-usuario/api-forum.git
```

**Executando no Linux:**

1. Navegue para o diretório do projeto:

```bash
cd api-forum
```

2. Instale as dependências:

```bash
mvn install
```

3. Execute a aplicação:

```bash
mvn spring-boot:run
```

**Executando no Windows:**

1. Abra o prompt de comando e navegue para o diretório do projeto.

2. Execute o seguinte comando:

```bash
mvn install
```

3. Execute o seguinte comando para iniciar a aplicação:

```bash
mvn spring-boot:run
```

**Acesse a API:**

Após iniciar a aplicação, você poderá acessar a API em:

```
http://localhost:8080/api/v1/topics
```

**Documentação da API:**

A documentação completa da API está disponível em:

```
http://localhost:8080/swagger-ui/
```

**Contribuições:**

Este projeto é de código aberto e incentivamos a participação da comunidade! Sinta-se à vontade para contribuir com sugestões, correções de bugs ou novos recursos.

**Licença:**

Este projeto está sob a licença Apache License 2.0.

**Esperamos que você aproveite este projeto e construa fóruns incríveis com sua comunidade!** 
