package br.com.fiap.arremate.msproduto.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;

    private String nome;

    private Categoria categoria;

    private Marca marca;

    private Modelo modelo;
}
