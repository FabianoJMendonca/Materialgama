package br.mendonca.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.mendonca.spring02.model.Produto;

// CRUD = Create, Read, Update, Delete
public interface ProdutoRepo extends CrudRepository<Produto, Long> {
    public Produto findByNome(String nome);
}
