package br.com.zup.SistemaBibliotecaSpring.repository;

import br.com.zup.SistemaBibliotecaSpring.model.BibliotecaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends JpaRepository<BibliotecaModel, Long> {

}
