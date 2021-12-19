package com.naveen.projects.graphqlapi.cards;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("cards")
public record Cards(@Id ObjectId _id, Integer id, Integer type, String front, String back, boolean known) {

}
