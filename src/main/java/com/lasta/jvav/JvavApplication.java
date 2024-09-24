package com.lasta.jvav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@SpringBootApplication
public class JvavApplication {

    public static void main(String[] args) {
        SpringApplication.run(JvavApplication.class, args);
    }

}
