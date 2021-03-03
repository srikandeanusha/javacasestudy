package com.cybage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cybage.model.User;
import com.cybage.repository.USerRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Autowired
    USerRepository ur;

 

    @Override
    public void run(String... args) throws Exception {
        ur.save(new User(101, "user101", "password","user"));
        ur.save(new User(102, "user102", "password","user"));
        ur.save(new User(103, "user103", "password","user"));
        ur.save(new User(104, "admin104", "password","admin"));
        ur.save(new User(105, "admin105", "password","admin"));        
    }
    

}
