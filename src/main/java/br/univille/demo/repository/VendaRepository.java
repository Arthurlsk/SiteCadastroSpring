package br.univille.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.demo.entity.Venda;

@Repository
public interface VendaRepository 
    extends JpaRepository<Venda,Long> {
    
}