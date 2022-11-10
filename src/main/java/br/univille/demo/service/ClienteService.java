package br.univille.demo.service;

import java.util.List;
import br.univille.demo.entity.Cliente;

public interface ClienteService {
    List<Cliente> getAll();
    Cliente save(Cliente cliente);
    Cliente findById(long id);
    void delete(long id);
    List<Cliente> findByNome(String nome);
}