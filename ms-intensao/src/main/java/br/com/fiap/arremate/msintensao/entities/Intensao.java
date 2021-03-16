package br.com.fiap.arremate.msintensao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity(name = "INTENSAO")
public class Intensao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntensao;

    private String idProduto;
//    private Produto produto;

    private String descricao;

    private BigDecimal valorEstimado;

    private String idComprador;
//    private Comprador comprador;

    private LocalDate data;

}
