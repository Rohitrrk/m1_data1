package com.cg.frs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.orb.dto.RoomRegistration;
import com.cg.org.dbutil.DBUtil;
import com.cg.org.exception.ExceptionClass;

public class RoomRegistrationDAOImpl implements IRoomRegistrationDAO {

	int result=0;
	int res = 0;
	
	Logger logger = Logger.getRootLogger();
	public RoomRegistrationDAOImpl()
	{
		PropertyConfigurator.configure("log4j.properties");
		
	}
	public int registerRoom(RoomRegistration flat) throws ExceptionClass
	{
		Connection con;
		try {
			con = DBUtil.getConnection();
		
		String insertQuery = "INSERT INTO Room_Registration Values(room_seq.nextval,?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(insertQuery);

		ps.setInt(1,flat.getHotel_id());
		ps.setInt(2,flat.getRoomType());
		ps.setInt(3,flat.getRoomArea());
		ps.setInt(4,flat.getRentAmount());
		ps.setInt(5,flat.getPaidAmount());

		 res =ps.executeUpdate();
		 
		 if(res == 1)
		 {
			 String sql = "Select room_seq.currval from dual";
			 PreparedStatement pst=con.prepareStatement(sql);
	 
			 ResultSet rs=pst.executeQuery();
			 while(rs.next())
			 {
				result = rs.getInt(1);
			 }
			 logger.info("Exceuted Sucessfully");
		 }
		 
		 else
		 {
			 return 0;
		 }
	 }
		catch (IOException |SQLException f) {
				

			System.out.println("Exception occured");
			logger.error("Exception Occured ");
			}

		catch(Exception e)
		{
			throw new ExceptionClass("exception occured");
		}
		
		return result;
	}
		


	public ArrayList<Integer> getAllOwnerIds() 
	{
		Connection con;
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			con = com.cg.org.dbutil.DBUtil.getConnection();
		 
		
		
		
		 String sql = "Select hotel_id  From Hotel_owners";
		 PreparedStatement pst=con.prepareStatement(sql);
		 
		 ResultSet rs=pst.executeQuery();
		 
		 while(rs.next())
			{
			 
			 	list.add(rs.getInt(1));
			 	
			}
		
		}
		
		catch(IOException | SQLException e)
		{
			
		}
		 return list;
	}




}
