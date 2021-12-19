package com.naveen.projects.graphqlapi.cards;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CardsController {

    private CardsRepository cardsRepository;

    public CardsController(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @QueryMapping
    List<Cards> cards() {
        return cardsRepository.findAll();
    }
}
