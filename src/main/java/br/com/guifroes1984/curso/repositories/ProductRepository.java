package br.com.guifroes1984.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
