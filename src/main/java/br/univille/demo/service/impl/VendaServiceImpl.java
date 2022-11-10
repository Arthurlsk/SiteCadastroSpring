package br.univille.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.demo.entity.Venda;
import br.univille.demo.repository.VendaRepository;
import br.univille.demo.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {
    @Autowired
    private VendaRepository repository;
    @Override
    public List<Venda> getAll() {
        return repository.findAll();
    }
    @Override
    public void save(Venda venda) {
        repository.save(venda);
    }
    @Override
    public Venda findById(long id) {
        var result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        return new Venda();
    }
}