package com.example.SpringBootMasterClass2021.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfiguration {

    @Bean("jsonplaceholder")
    CommandLineRunner commandLineRunner(JSONPlaceHolderClient jsonPlaceHolderClient) {
        return args -> {
            System.out.println("JSONPlaceHolder was called");
            System.out.println(jsonPlaceHolderClient.getPost(1));
            System.out.println(jsonPlaceHolderClient.getPosts().size());
        };
    }
}
