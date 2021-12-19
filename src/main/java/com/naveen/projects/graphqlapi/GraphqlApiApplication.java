package com.naveen.projects.graphqlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApiApplication.class, args);
    }

}
/*
@Controller
class CustomerGraphqlController {

  private final CustomerRepository customerRepository;

    CustomerGraphqlController(CustomerRepository repository) {
        this.customerRepository = repository;
    }

    @QueryMapping
    Flux<Customer> customersByName(@Argument String name) {
        return this.customerRepository.findByName(name);
    }

    @SchemaMapping(typeName = "Customer")
    Flux<Order> orders(Customer customer) {
        var orders = new ArrayList<Order>();
        for (var orderId = 1; orderId <= (Math.random() * 1000); orderId++) {
            orders.add(new Order(orderId, customer.id()));
        }
        return Flux.fromIterable(orders);
    }

    @QueryMapping
    Flux<Customer> customers() {
        return customerRepository.findAll();
    }

    @MutationMapping
    Mono<Customer> addCustomer(@Argument String name) {
        return this.customerRepository.save(new Customer(null,name));
    }

    @SubscriptionMapping
    Flux<CustomerEvent> customerEvents(@Argument Integer customerId) {
        return this.customerRepository.findById(customerId)
                .flatMapMany(customer -> {
                    var stream = Stream.generate(
                            () -> new CustomerEvent(customer, Math.random() > 100 ? CustomerEventType.DELETED: CustomerEventType.UPDATED));
                    return Flux.fromStream( stream);
                })
                .delayElements(Duration.ofSeconds(1))
                .take(10);
    }

}
*/

