package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistration;

public interface IRoomRegistrationService 
{
	public int registerRoom(RoomRegistration flat) throws IOException, SQLException;
	
	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;

}
