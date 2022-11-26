package com.example.test.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;


@Configuration
public class SwaggerConfig {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("MyApp Rest APIs")
                .description("APIs for MyApp.")
                .version("1.0")
                .termsOfServiceUrl("Term of service")
                .license("Licence of API")
                .licenseUrl("API Licence URL")
                .contact(new Contact("test", "www.org.com", "test@emaildomain.com"))
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }
}
