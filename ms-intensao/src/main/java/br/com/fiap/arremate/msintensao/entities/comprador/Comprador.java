package br.com.fiap.arremate.msintensao.entities.comprador;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "compradores")
public class Comprador {

    @Id
    private String id;

    private String cpf;

    private String nome;

    private String sobreNome;

    private Usuario usuario;

    private Endereco endereco;

    private Contato contato;

}
