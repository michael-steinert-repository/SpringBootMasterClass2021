package com.example.SpringBootMasterClass2021.infoapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "info.app")
public class InfoApp {
    private String name;
    private String description;
    private String version;
}
