package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistration;
import com.cg.org.exception.ExceptionClass;

public interface IRoomRegistrationService 
{
	public int registerRoom(RoomRegistration flat) throws IOException, SQLException, ExceptionClass;
	
	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;

	public boolean validateRoomType(int roomType);

	public boolean validate(int roomArea);

}
