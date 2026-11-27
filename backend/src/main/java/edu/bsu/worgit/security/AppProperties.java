package edu.bsu.worgit.security;

import java.time.Duration;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** Binds the "worgit" block of application.yml. */
@ConfigurationProperties(prefix = "worgit")
public record AppProperties(Jwt jwt, Login login, Cors cors) {

    public record Jwt(String secret, Duration ttl, String issuer) {}

    public record Login(int maxFailures, Duration window) {}

    public record Cors(List<String> allowedOrigins) {}
}
