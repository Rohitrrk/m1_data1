package com.cg.orb.dto;

public class HotelDetails
{
	int hotelId;
	String name;
	String mobileNo;
	
	public HotelDetails() {
		super();
	}
	public HotelDetails(int hotelId, String name, String mobileNo) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	

}
