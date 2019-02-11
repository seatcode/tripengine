package org.metropolis

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact


@SpringBootApplication
open class TripEngineApplication


fun main(args: Array<String>) {
    SpringApplication.run(TripEngineApplication::class.java, *args)
}


@Configuration
@EnableSwagger2
open class SwaggerConfiguration {

    @Bean
    open fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()


    private fun generateApiInfo(): ApiInfo {
        return ApiInfo(
            "4YFN Metropolis:lab Hackathob",
            "Base hackathon project for backend developers",
            "Version 0.0.1",
            "urn:tos",
            Contact("Metropolis:lab","www.metropolis.com","metropolis@lab"),
            "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0", emptyList()
        )
    }
}