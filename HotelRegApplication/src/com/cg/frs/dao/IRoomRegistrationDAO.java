package com.cg.frs.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistration;

public interface IRoomRegistrationDAO {

	public int registerRoom(RoomRegistration flat) throws IOException, SQLException;

	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;
	
	

}
