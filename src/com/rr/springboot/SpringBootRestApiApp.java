/**
 * 
 */
package com.rr.springboot;

/**
 * @author User
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rr.springboot"})
public class SpringBootRestApiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootRestApiApp.class, args);
	}

}
