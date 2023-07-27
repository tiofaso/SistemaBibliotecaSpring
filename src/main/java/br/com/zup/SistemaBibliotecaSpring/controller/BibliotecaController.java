package br.com.zup.SistemaBibliotecaSpring.controller;

import br.com.zup.SistemaBibliotecaSpring.model.BibliotecaModel;
import br.com.zup.SistemaBibliotecaSpring.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BibliotecaController {

    @Autowired
    BibliotecaService bibliotecaService;

    //Endopoint de inserção
    //Post - adiciona um livro à db
    @PostMapping(path = "/adicionar")
    @ResponseStatus(HttpStatus.CREATED)
    public BibliotecaModel inserirLivro(@RequestBody BibliotecaModel bibliotecaModel) {
        return bibliotecaService.cadastrarLivro(bibliotecaModel);
    }

    //Endpoint de consulta
    //Get - pega todos os livros do acervo
    @GetMapping(path = "/consulta")
    public List<BibliotecaModel> buscarTodos() {

        return bibliotecaService.buscaTodos();
    }

    //Get - pega um livro do acervo a partir do seu id
    @GetMapping(path = "/consultalivro/{id}")
    public Optional<BibliotecaModel> buscaLivroPorId(@PathVariable Long id) {

        return bibliotecaService.buscaPorId(id);
    }

    //Endpoint de atualização
    //Put - atualiza um determinado livro do acervo
    @PutMapping(path = "/alteralivro/{id}")
    public BibliotecaModel alteraLivro(@PathVariable Long id, @RequestBody BibliotecaModel bibliotecaModel){
        return bibliotecaService.alterarLivro(id,bibliotecaModel);
    }

    //End point de deleção (diabo de nome feio!)
    //Delete - apaga um item específico da base
    @DeleteMapping(path = "/apagalivro/{id}")
    public void deletaLivro(@PathVariable Long id) {

        bibliotecaService.deletar(id);
    }

}
