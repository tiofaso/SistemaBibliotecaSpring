# Exercício de fixação de spring boot

Nesse primeiro exercício de spring boot foi criado um pequeno sistema tipo CRUD para inserir, consultar, editar e apagar dados do acervo de uma biblioteca fictícia.

Como dados de entrada para testes foi utilizado os seguintes itens disponíveis na pasta **/resources/json**:

        {
        "id": 1,
        "nomeLivro": "Sistemas Orientados a Objetos",
        "autor": "Pablo Rangel",
        "dataLancamento": "2021",
        "isbn": "9786588431412"
        }
        {
        "id": 3,
        "nomeLivro": "O Guia de Sobrevivência a Zumbis",
        "autor": "Max Brooks",
        "dataLancamento": "2006",
        "isbn": "9788532520647"
        }
        {
        "id": 4,
        "nomeLivro": "O Chamado de Cthulhu",
        "autor": "H. P. Lovecraft",
        "dataLancamento": "2009",
        "isbn": "9788577151165"
        }
        {
        "id": 2,
        "nomeLivro": "Coraline",
        "autor": "Neil Gaiman",
        "dataLancamento": "2003",
        "isbn": "9788532516268"
        }

Para poder movimentar a DB, teste os seguintes links em um programa como **[Postman](https://www.postman.com/downloads/)**:

[http://localhost:8080/consulta](http://localhost:8080/consulta)<br>
[http://localhost:8080/adicionar](http://localhost:8080/adicionar)<br>
[http://localhost:8080/consultalivro/$id](http://localhost:8080/consultalivro/)<br>
[http://localhost:8080/alteralivro/$id](http://localhost:8080/alteralivro/)<br>
[http://localhost:8080/apagalivro/$id](http://localhost:8080/apagalivro)

**IMPORTANTE:** o valor **$id** é para ser substituído por um índice numérico. Exemplo:
[http://localhost:8080/consultalivro/1](http://localhost:8080/consultalivro/1)

-- Última revisão: 27/07/2023