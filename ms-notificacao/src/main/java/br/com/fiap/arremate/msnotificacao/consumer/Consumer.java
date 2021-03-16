package br.com.fiap.arremate.msnotificacao.consumer;


import br.com.fiap.arremate.msnotificacao.email.EmailConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private EmailConfig emailConfig;

    @RabbitListener(queues = "arremate.queue")
    private void enviarNotificacao(String notificacao){

    System.out.println("Objeto da fila - > " + notificacao);
        //        emailConfig.send(criarCorpoEmail(intensao));
    }

//    private String criarCorpoEmail(Intensao intensao) {
//        StringBuilder intensaoBuilder = new StringBuilder();
//
//        intensaoBuilder.append("Produto: " + intensao.getIdProduto())
//                .append(System.lineSeparator())
//                .append("Descrição: " + intensao.getDescricao())
//                .append(System.lineSeparator())
//                .append("Valor estimado: " + intensao.getValorEstimado())
//                .append(System.lineSeparator())
//                .append("Comprador: " + intensao.getIdComprador());
//
//        return intensaoBuilder.toString();
//    }
}
