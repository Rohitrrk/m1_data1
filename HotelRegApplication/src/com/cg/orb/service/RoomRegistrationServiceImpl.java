package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.frs.dao.RoomRegistrationDAOImpl;
import com.cg.orb.dto.RoomRegistration;
import com.cg.org.exception.ExceptionClass;

public class RoomRegistrationServiceImpl implements IRoomRegistrationService{

	IRoomRegistrationDAO dao = new RoomRegistrationDAOImpl();
	public int registerRoom(RoomRegistration flat) throws IOException, SQLException, ExceptionClass 
	{
		dao =  new RoomRegistrationDAOImpl();
		
		return dao.registerRoom(flat);
	}

	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException {
		dao =  new RoomRegistrationDAOImpl();
		return dao.getAllOwnerIds();
	}


	public boolean validateRoomType(int roomType)
	{
		if(roomType == 1 || roomType == 2)
		{
			return true;
		}
		else
		{
			System.out.println("Invalid room type");
			return false;
		}
	}

	public boolean validate(int input)
	{
		String s ="[0-9]{3,}";
		String d = String.valueOf(input);
		if(Pattern.matches(s,d))
		 {
			 return true;
		 }
		 else
		 {
	    	 System.out.println("Input must contain digits.");
	    	 return false;
		 }	

	}
	

	

	
	

	
//	public boolean isValidInput(RoomRegistration flat) 
//	{
//		List<String> validateErrors = new ArrayList<String>();
//		boolean set = true;
//		
//		if(!validate(flat.getHotel_id()))
//		{
//			validateErrors.add("\nThis is not a valid Hotel ID");
//		}
//		if(!validateRoomType(flat.getRoomType()))
//		{
//			validateErrors.add("\nThis is not a valid Room Type");
//		}
//		
//		if(!validate(flat.getRoomArea()))
//		{
//			validateErrors.add("\nThis is not a valid Room Area");
//		}
//		if(!validate(flat.getRentAmount()))
//		{
//			validateErrors.add("\nThis is not a valid Rent Amount");
//		}
//		if(!validate(flat.getPaidAmount()))
//		{
//			validateErrors.add("\nThis is not a valid Rent Amount");
//		}
//		if(!validateErrors.isEmpty())
//		{
//			set = false;
//			
//		}
//		return set;
//
//
//	}




}
