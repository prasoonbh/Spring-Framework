package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //to declare the respective class as configuration class
public class JavaConfig 
{
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		// creating new student object
		Student st = new Student(getSamosa());
		return st;
	}
}
