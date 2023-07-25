package br.com.guifroes1984.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
