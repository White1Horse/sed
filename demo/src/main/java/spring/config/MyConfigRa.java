package spring.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfigRa {


    @Bean
    public Queue dir(){
        return new Queue("HAHA");
    }
    @Bean
    public  Queue ss(){
        return new Queue(" ");
    }
    @Bean
    public TopicExchange ss1(){
        return new TopicExchange("jsfdlk");
    }
    @Bean
    public Binding ss23(){
        return  BindingBuilder.bind(dir()).to(ss1()).with("");
    }
}
