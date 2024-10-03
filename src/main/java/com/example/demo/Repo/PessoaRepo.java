package com.example.demo.Repo;

import com.example.demo.Model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PessoaRepo extends JpaRepository<Pessoa,Long> {
}
