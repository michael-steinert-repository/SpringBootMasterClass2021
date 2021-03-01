package com.example.SpringBootMasterClass2021.jsonplaceholder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Post {
    private final Integer userId;
    private final Integer id;
    private final String title;
    private final String body;
}
