package br.com.fiap.arremate.msintensao.entities.comprador;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "enderecos")
public class Endereco {

    @Id
    private String id;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cep;

    private String cidade;

    private String estado;

}
