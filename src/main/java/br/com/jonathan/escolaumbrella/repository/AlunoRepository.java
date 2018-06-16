package br.com.jonathan.escolaumbrella.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.jonathan.escolaumbrella.model.Aluno;

public interface AlunoRepository extends MongoRepository<Aluno, String>{

}
