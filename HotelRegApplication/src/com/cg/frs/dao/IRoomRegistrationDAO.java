package com.cg.frs.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistration;
import com.cg.org.exception.ExceptionClass;

public interface IRoomRegistrationDAO {

	public int registerRoom(RoomRegistration flat) throws IOException, SQLException, ExceptionClass;

	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;

	

	

}
