package br.com.fiap.arremate.msnotificacao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produto {

    private String descricao;

    private BigDecimal valorEstimado;
}
