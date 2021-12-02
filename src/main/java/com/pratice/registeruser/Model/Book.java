package com.pratice.registeruser.Model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
@AllArgsConstructor
public class Book {
    @Id
    String Id;
    String name;
    String author;
    String publish;

    
}
