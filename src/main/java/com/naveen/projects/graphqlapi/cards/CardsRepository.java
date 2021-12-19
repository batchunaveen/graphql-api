package com.naveen.projects.graphqlapi.cards;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CardsRepository extends MongoRepository<Cards, String> {

}
