package com.pas.ControleCorredor.adaptadores.Config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import org.springframework.context.annotation.Bean;
import com.pas.ControleCorredor.negocio.Utils.Constants;
import springfox.documentation.service.ApiInfo;

import java.util.Collections;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    /*
     *   Swagger-JSON path: {context-path}/v2/api-docs
     *   Swagger-UI   path: {context-path}/swagger-ui.html
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
    }

    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo (
            "Project and Architecture of Software",
            "PAS Project", Constants.VERSION,
            "urn:tos", DEFAULT_CONTACT,
            "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList()
    );

}
