package br.univille.demo.service;

import java.util.List;
import br.univille.demo.entity.Cidade;

public interface CidadeService {
    List<Cidade> getAll();
    Cidade save(Cidade cidade);
    Cidade findById(long id);
    
}