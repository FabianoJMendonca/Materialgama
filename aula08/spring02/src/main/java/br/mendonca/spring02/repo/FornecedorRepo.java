package br.mendonca.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.mendonca.spring02.model.Fornecedor;

public interface FornecedorRepo extends CrudRepository<Fornecedor, Long> {
    
}
