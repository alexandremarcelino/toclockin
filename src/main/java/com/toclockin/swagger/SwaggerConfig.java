package com.toclockin.swagger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableWebMvc
@EnableSwagger2
@SpringBootApplication
public class SwaggerConfig {

    @Bean
    public Docket apiAdmin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.toclockin"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo())
                .globalOperationParameters(
                        Collections.singletonList(
                                new ParameterBuilder()
                                        .name("Authorization")
                                        .description("Header para Token JWT")
                                        .modelRef(new ModelRef("string"))
                                        .parameterType("header")
                                        .required(false)
                                        .build()));
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(" CONTROLE API-REST")
                .description(" Api para controle do ponto e acesso de uma empresa")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("DIO", "https://github.com/alexandremarcelino", "alexandre.hoffmann.marcelino@gmail.com"))
                .build();
    }
}