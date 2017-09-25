package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.frs.dao.RoomRegistrationDAOImpl;
import com.cg.orb.dto.RoomRegistration;

public class RoomRegistrationServiceImpl implements IRoomRegistrationService{

	IRoomRegistrationDAO dao = new RoomRegistrationDAOImpl();
	public int registerRoom(RoomRegistration flat) throws IOException, SQLException 
	{
		dao =  new RoomRegistrationDAOImpl();
		
		return dao.registerRoom(flat);
	}

	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException {
		dao =  new RoomRegistrationDAOImpl();
		return dao.getAllOwnerIds();
	}

}
