package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")
public class Address
{
   private int addressId;
   String street;
   String city;
   String state;
   public Address() {
	   
	   System.out.println("Default constructor of Adddres is called");
    }
public Address(int addressId, String street, String city, String state) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
	this.state = state;
	System.out.println("Overloaded constructorof Address is called");
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", date=" + state + "]";
}
public int getAddressId() {
	System.out.println("Setting address Id");
	return addressId;
}
public void setAddressId(int addressId) {
	System.out.println("setting addressId"+addressId);
	this.addressId = addressId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	System.out.println("Setting Street"+street);
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	System.out.println("Setting City"+city);
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	System.out.println("Setting state "+state);
	this.state = state;
}
    
}
