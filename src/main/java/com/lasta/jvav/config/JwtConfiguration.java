package com.lasta.jvav.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfiguration {

    @Value("${jwt.secret_key}")
    public String JWT_SECRET;
}
