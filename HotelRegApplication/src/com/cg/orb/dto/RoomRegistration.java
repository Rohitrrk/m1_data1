package com.cg.orb.dto;

public class RoomRegistration
{
	int roomNo;
	int hotel_id;
	int roomType;
	int roomArea;
	int paidAmount;
	int rentAmount;
	
	public RoomRegistration() {
		super();
	}

	
	public RoomRegistration(int roomNo, int hotel_id, int roomType,
			int roomArea, int paidAmount, int rentAmount) {
		super();
		this.roomNo = roomNo;
		this.hotel_id = hotel_id;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.paidAmount = paidAmount;
		this.rentAmount = rentAmount;
	}


	public RoomRegistration(int hotel_id, int roomType, int roomArea,
			int paidAmount, int rentAmount) {
		super();
		this.hotel_id = hotel_id;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.paidAmount = paidAmount;
		this.rentAmount = rentAmount;
	}


	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public int getRoomType() {
		return roomType;
	}

	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}

	public int getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
	}

	public int getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}

	public int getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	
	

}
