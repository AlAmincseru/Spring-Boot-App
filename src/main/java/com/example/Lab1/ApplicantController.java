package com.example.Lab1;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Lab1.Models.Applicant;
import com.example.Lab1.repositories.ApplicantRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Record")
public class ApplicantController {
  @Autowired
  private ApplicantRepository repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Applicant> getAllPets() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Applicant getPetById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Applicant pets) {
    pets.set_id(id);
    repository.save(pets);
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Applicant createPet(@Valid @RequestBody Applicant pets) {
    pets.set_id(ObjectId.get());
    repository.save(pets);
    return pets;
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePet(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
}