package com.example.Lab1.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Lab1.Models.Applicant;

public interface ApplicantRepository extends MongoRepository<Applicant, String> {

	Applicant findBy_id(ObjectId _id);
}
