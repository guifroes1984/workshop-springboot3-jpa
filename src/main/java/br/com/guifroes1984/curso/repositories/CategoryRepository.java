package br.com.guifroes1984.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
