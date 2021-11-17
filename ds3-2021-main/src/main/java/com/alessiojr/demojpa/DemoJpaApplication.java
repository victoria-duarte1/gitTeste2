package com.alessiojr.demojpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public @SpringBootApplication class DemoJpaApplication {

  private static final Logger log = LoggerFactory.getLogger(DemoJpaApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(DemoJpaApplication.class, args);

    log.info("--->Minha Primeira Aplicação<------");
  }

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.OAS_30)
        .apiInfo(new ApiInfoBuilder()
            .title("DemoDs3 2021 API")
            .description("Uma API REST para o Trabalho PP ")
            .version("0.0.1-SNAPSHOT")
            .license("MIT")
            .licenseUrl("https://opensource.org/licenses/MIT")
            .build())
        .select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
        .build();
  }
}
