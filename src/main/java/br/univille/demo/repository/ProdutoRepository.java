package br.univille.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.demo.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    
}