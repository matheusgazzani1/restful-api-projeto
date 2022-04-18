package br.com.matheusgazzani1;

import br.com.matheusgazzani1.domain.entity.Cliente;
import br.com.matheusgazzani1.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class RestFullAPI {

    public static void main(String[] args) {
        SpringApplication.run(RestFullAPI.class, args);
    }
}
