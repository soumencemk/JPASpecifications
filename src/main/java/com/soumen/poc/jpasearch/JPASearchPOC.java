package com.soumen.poc.jpasearch;

import com.soumen.poc.jpasearch.domain.dao.Employee;
import com.soumen.poc.jpasearch.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class JPASearchPOC {

    public static void main(String[] args) {
        SpringApplication.run(JPASearchPOC.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository repo) {
        return args -> repo.saveAll(Arrays.asList("Soumen", "Mark", "Paul", "Debra", "Joshua")
                .stream().map(name -> new Employee(name))
                .collect(Collectors.toList()));
    }
}
