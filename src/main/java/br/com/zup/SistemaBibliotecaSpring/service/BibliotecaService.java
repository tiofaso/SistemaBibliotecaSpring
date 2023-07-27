package br.com.zup.SistemaBibliotecaSpring.service;

import br.com.zup.SistemaBibliotecaSpring.model.BibliotecaModel;
import br.com.zup.SistemaBibliotecaSpring.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService {
    @Autowired
    BibliotecaRepository bibliotecaRepository;

    //Método que cadastra um livro no acervo
    public BibliotecaModel cadastrarLivro(BibliotecaModel bibliotecaModel) {

        return bibliotecaRepository.save(bibliotecaModel);
    }

    //Método que busca todos os livros no acervo
    public List<BibliotecaModel> buscaTodos() {

        return bibliotecaRepository.findAll();
    }

    //Método que busca um determinado livro no acervo
    public Optional<BibliotecaModel> buscaPorId(Long id) {

        return bibliotecaRepository.findById(id);
    }

    //Médoto que atualiza um determinado livro no acervo
    public BibliotecaModel alterarLivro(Long id, BibliotecaModel bibliotecaModel) {
        BibliotecaModel livro = buscaPorId(id).get();

        if(bibliotecaModel.getAutor() != null) {
            livro.setAutor(bibliotecaModel.getAutor());
        }

        if(bibliotecaModel.getNomeLivro() != null) {
            livro.setNomeLivro(bibliotecaModel.getNomeLivro());
        }

        if(bibliotecaModel.getDataLancamento() != null) {
            livro.setDataLancamento(bibliotecaModel.getDataLancamento());
        }

        if(bibliotecaModel.getDataLancamento() != null) {
            livro.setIsbn(bibliotecaModel.getIsbn());
        }

        return bibliotecaRepository.save(livro);
    }

    //método que apaga registro da DB a partir de um id
    public void deletar(Long id) {

        bibliotecaRepository.deleteById(id);
    }
}
