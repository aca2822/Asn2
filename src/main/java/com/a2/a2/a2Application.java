package com.a2.a2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
// implements CommandLineRunner (put this after public class a2Application)
public class a2Application{

	public static void main(String[] args) {
		SpringApplication.run(a2Application.class, args); 
		
		//List<Student> students = new ArrayList<>();
	}

	// @Override
    // public void run(String... args) throws Exception {
    //     String sql = "INSERT INTO students VALUES ("
    //             + "'car', 'cat', 2,3,'yes',4,5,2222)";
         
    //     int rows = jdbcTemplate.update(sql);
    //     if (rows > 0) {
    //         System.out.println("A new row has been inserted.");
    //     }
    // }
    

}