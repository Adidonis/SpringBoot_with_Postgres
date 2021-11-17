package com.project.postgresql;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlienService 
{

	//   to inject the object dependency Setters or Constructors
	@Autowired 
	private AlienRepository AlienRepo;

	// Finding all return typ in JPA repository
	
	public List<Information> getaliens(){
		return AlienRepo.findAll();
	}

	public Optional<Information> getaliensbyId(String id) {
		return AlienRepo.findById(Integer.parseInt(id));
	}

	// Save it to the database using the AlienRepo
	
	public void setaliens(Information information) {
		AlienRepo.save(information);
	}

    public static void add(Information information) {
    }
	
	
}
