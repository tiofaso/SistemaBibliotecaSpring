package br.com.zup.SistemaBibliotecaSpring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_acervo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BibliotecaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @Column(length = 100)
    private String nomeLivro;
    @Column(length = 50)
    private String autor;
    @Column(length = 4)
    private String dataLancamento;
    @Column(length = 13)
    private String isbn;
}
