package br.com.fiap.arremate.msintensao.repositories;

import br.com.fiap.arremate.msintensao.entities.Intensao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IntensaoRepository extends MongoRepository<Intensao, String> {
}
