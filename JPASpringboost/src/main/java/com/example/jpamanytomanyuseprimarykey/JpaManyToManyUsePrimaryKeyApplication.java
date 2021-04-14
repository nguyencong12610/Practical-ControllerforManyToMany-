package com.example.jpamanytomanyuseprimarykey;

import com.example.jpamanytomanyuseprimarykey.model.Book;
import com.example.jpamanytomanyuseprimarykey.model.BookPublisher;
import com.example.jpamanytomanyuseprimarykey.model.Publisher;
import com.example.jpamanytomanyuseprimarykey.repository.BookPublisherRepository;
import com.example.jpamanytomanyuseprimarykey.repository.BookRepository;
import com.example.jpamanytomanyuseprimarykey.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JpaManyToManyUsePrimaryKeyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaManyToManyUsePrimaryKeyApplication.class, args);
    }


}
