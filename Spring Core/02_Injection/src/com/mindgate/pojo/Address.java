package com.mindgate.pojo;

public class Address
{
   private int addressId;
   String street;
   String city;
   String state;
   public Address() {
    }
public Address(int addressId, String street, String city, String state) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
	this.state = state;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", date=" + state + "]";
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
    
}
