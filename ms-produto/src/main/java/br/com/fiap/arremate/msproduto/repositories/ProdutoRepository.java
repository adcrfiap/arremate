package br.com.fiap.arremate.msproduto.repositories;

import br.com.fiap.arremate.msproduto.entities.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
