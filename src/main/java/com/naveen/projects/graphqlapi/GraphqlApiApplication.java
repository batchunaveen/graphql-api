package com.naveen.projects.graphqlapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import org.springframework.graphql.data.method.annotation.SchemaMapping;

@SpringBootApplication
public class GraphqlApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApiApplication.class, args);
    }

}

@Controller
class CustomerGraphqlController {

    private final CustomerRepository customerRepository;

    CustomerGraphqlController(CustomerRepository repository) {
        this.customerRepository = repository;
    }

    @SchemaMapping (typeName = "Query", field = "customers")
    Flux<Customer> findAlll() {
        return customerRepository.findAll();
    }

}

interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {

}

record Customer(@JsonProperty("id") @Id Integer id,@JsonProperty("name") String name) {

}