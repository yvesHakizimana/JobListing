package com.code.joblisting.configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Yves HAKIZIZIMANA",
                        email = "yhakizimana@rca.ac.rw",
                        url="google.com"),
                description = "OpenApi documentation for Spring Security",
                title = "OpenApi specification - Yves",
                version = "1.0",
                license = @License(
                        name = "Rwanda Coding Academy",
                        url = "google.com"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local Dev Environment",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "Production Dev Environment",
                        url = "http://localhost:8080"
                ),
        }
)

public class OpenApiConfiguration {
}
