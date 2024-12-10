package com.github.movieproject.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {
    private String username;
    private String password;
    private String driverClassName;
    private String url;
}