package br.univille.demo.service;

import java.util.List;

import br.univille.demo.entity.Produto;

public interface ProdutoService {
    List<Produto> getAll();

    void save(Produto produto);

    Produto findById(long id);

    void delete(long id);
}