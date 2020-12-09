package com.ecollege.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecollege.model.Profile;
import com.ecollege.repository.ProfileRepository;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

	Logger log = LoggerFactory.getLogger(ProfileRestController.class);
	@Autowired
	ProfileRepository repo;
	
	//get all, sorted
	@GetMapping("/profiles")
	public List<Profile> getAllProfiles(){
		return repo.findAll();
	}
	
	//get all, ordered by nationality
	@GetMapping("/profiles/ordered")
	public List<Profile> getProfilesOrderedByNationality(){
		return repo.getProfilesByOrderByNationality();
	}
	
	//get a profile by id
	@GetMapping("/profiles/{id}")
	public Optional<Profile> getProfileById(@PathVariable("id") long id){
		log.error("id" + id);
		return repo.findById(id);
	}
	
	//register
	@PostMapping("/profiles")
	public Profile register(@RequestBody Profile profile) {
		return repo.save(profile);
	}
	
	//update
	@PutMapping("/profiles/{id}")
	public Profile update(@PathVariable("id") long id, @RequestBody Profile profile) {
		repo.findById(id);
		return repo.save(profile);
	}
	
	//delete
	@DeleteMapping("profiles/{id}")
	public void delete(@PathVariable("id") long id) {
		repo.deleteById(id);
	}
}
