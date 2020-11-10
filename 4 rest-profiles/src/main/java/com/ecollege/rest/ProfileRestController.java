package com.ecollege.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecollege.model.Profile;
import com.ecollege.repository.ProfileRepository;
import java.util.Optional;

@RestController
public class ProfileRestController {
	//test

	@Autowired
	ProfileRepository repo;
	
	//get all, sorted
	@GetMapping("profiles")
	public List<Profile> getAllProfiles(){
		return repo.findAll();
	}
	
	//get all, ordered by nationality
	@GetMapping("/ordered")
	public List<Profile> getProfilesOrderedByNationality(){
		return repo.getProfilesByOrderByNationality();
	}
	
	//get a profile by id
	@GetMapping("/profile/{id}")
	public Optional<Profile> getProfileById(@PathVariable("id") long id){
		return repo.findById(id);
	}
	
	//register
	@PostMapping("/add")
	public Profile register(@RequestBody Profile profile) {
		return repo.save(profile);
	}
	
	//update
	@PutMapping("/update/{id}")
	public Profile update(@PathVariable("id") long id, @RequestBody Profile profile) {
		repo.findById(id);
		return repo.save(profile);
	}
	
	//patch
	@PatchMapping("/patch/{id}")
	public Profile patch(@PathVariable("id") long id, String firstName, String surName) {
		return repo.saveDetails(firstName, surName);
	}
	
	//delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		repo.deleteById(id);
	}
}
