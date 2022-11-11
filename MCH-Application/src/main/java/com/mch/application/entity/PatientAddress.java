package com.mch.application.entity;

public class PatientAddress {

	 private String addressLineOne;
	 private String addressLineTwo;
	 private String addressLineThree;
	 private int postalCode;
	 private String city;
	 private String region;
	 private String country;
	 private String Landmark;
	 

	public PatientAddress() {
	}
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}
	public String getAddressLineTwo() {
		return addressLineTwo;
	}
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}
	public String getAddressLineThree() {
		return addressLineThree;
	}
	public void setAddressLineThree(String addressLineThree) {
		this.addressLineThree = addressLineThree;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLandmark() {
		return Landmark;
	}
	public void setLandmark(String landmark) {
		Landmark = landmark;
	}
	
	
	public PatientAddress(String addressLineOne, String addressLineTwo, String addressLineThree, int postalCode,
			String city, String region, String country, String landmark) {
		super();
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.addressLineThree = addressLineThree;
		this.postalCode = postalCode;
		this.city = city;
		this.region = region;
		this.country = country;
		Landmark = landmark;
	}
	
	@Override
	public String toString() {
		return "PatientAddress [addressLineOne=" + addressLineOne + ", addressLineTwo=" + addressLineTwo
				+ ", addressLineThree=" + addressLineThree + ", postalCode=" + postalCode + ", city=" + city
				+ ", region=" + region + ", country=" + country + ", Landmark=" + Landmark + "]";
	}
	 
	 
}
