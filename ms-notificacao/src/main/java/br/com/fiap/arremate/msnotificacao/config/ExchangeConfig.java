package br.com.fiap.arremate.msnotificacao.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {

    @Autowired
    private Queue queue;

    @Bean
    public Exchange directExchange() {
        return ExchangeBuilder
                .directExchange("arremate.exchange")
                .build();
    }

    @Bean
    public Binding bindingQueueA() {
        return BindingBuilder
                .bind(queue)
                .to(directExchange())
                .with("arremate.routingkey")
                .noargs();
    }
}
