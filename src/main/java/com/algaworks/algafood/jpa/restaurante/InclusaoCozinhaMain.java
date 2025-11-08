package com.algaworks.algafood.jpa.restaurante;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

public class InclusaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNome("Komi Keto");
        restaurante1.setTaxaFrete(new BigDecimal("20.00"));

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNome("La Gran Parrilla");
        restaurante2.setTaxaFrete(new BigDecimal("18.00"));

        restaurantes.salvar(restaurante1);
        restaurantes.salvar(restaurante2);

    }
}
