package com.ecollege.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecollege.model.Profile;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, Long> {
	
	//order all profiles by nationality
	List<Profile> getProfilesByOrderByNationality();
	
//	Profile saveDetails(String firstName, String surName);

}
