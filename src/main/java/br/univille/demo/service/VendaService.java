package br.univille.demo.service;

import java.util.List;
import br.univille.demo.entity.Venda;

public interface VendaService {
    List<Venda> getAll();
    void save(Venda venda);
    Venda findByIdemo(long id);
}