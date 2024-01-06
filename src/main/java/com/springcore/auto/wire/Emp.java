package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp 
{
  
	private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
	System.out.println("Setting Address value");
}
@Autowired
public Emp(Address adderess) {
	super();
    this.address = address;
    System.out.println("INside constructor");
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
   
   
}
