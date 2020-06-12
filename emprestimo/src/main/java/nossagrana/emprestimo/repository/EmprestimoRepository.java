package nossagrana.emprestimo.repository;

import nossagrana.emprestimo.entity.Emprestimo;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Document
public interface EmprestimoRepository extends MongoRepository<Emprestimo, String> {
    List<Emprestimo> findAll();
}
