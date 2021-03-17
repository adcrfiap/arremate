package br.com.fiap.arremate.msintensao.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Entity
public class Intensao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntensao;

    private Long idProduto;
//    private Produto produto;

    private String descricao;

    private BigDecimal valorEstimado;

    private Long idComprador;
//    private Comprador comprador;

    private LocalDate data;

}
