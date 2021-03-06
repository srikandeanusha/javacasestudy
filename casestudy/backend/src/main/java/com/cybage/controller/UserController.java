package com.cybage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cybage.model.User;
import com.cybage.repository.USerRepository;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	@Autowired 
	USerRepository ur;
	
	@GetMapping
	public List<User> getAllUsers(){
		return ur.findAll();
	}
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable int id){
		return ur.findById(id);
	}
	@PostMapping
	public String addUser(@RequestBody User user){
		ur.save(user);
		return "successfully created user record";
	}
	@PutMapping
	public String updateUser(@RequestBody User user){
		ur.save(user);
		return "successfully updated user record";
	}
	@DeleteMapping("/{id}")
	public String updateUser(@PathVariable int id){
		ur.deleteById(id);
		return "successfully delete user record";
	}

}
