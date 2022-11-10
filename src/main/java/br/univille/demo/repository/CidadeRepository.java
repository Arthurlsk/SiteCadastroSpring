package br.univille.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.demo.entity.Cidade;

@Repository
public interface CidadeRepository 
        extends JpaRepository<Cidade,Long>{
    
}