package org.example.springbiblioteca;

import org.example.springbiblioteca.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUsuario extends JpaRepository<usuario, Integer> {
}
