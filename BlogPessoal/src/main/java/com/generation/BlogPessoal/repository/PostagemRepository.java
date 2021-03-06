package com.generation.BlogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.BlogPessoal.model.Postagens;

@Repository
public interface PostagemRepository extends JpaRepository<Postagens, Long>{
	public List<Postagens> findAllByTituloContainingIgnoreCase (String titulo);
	
	
}



