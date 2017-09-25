package com.cg.frs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistration;
import com.cg.org.dbutil.DBUtil;

public class RoomRegistrationDAOImpl implements IRoomRegistrationDAO {

	int result=0;
	int res = 0;
	public int registerRoom(RoomRegistration flat) throws IOException, SQLException 
	{
		Connection con =DBUtil.getConnection();
		String insertQuery = "INSERT INTO Room_Registration Values(room_seq.nextval,?,?,?,?,?)";
		
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
		 }
		 else
		 {
			 return 0;
		 }
		return result;
		 
		
	}


	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException 
	{
		Connection con = com.cg.org.dbutil.DBUtil.getConnection();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		 String sql = "Select hotel_id  From Hotel_owners";
		 PreparedStatement pst=con.prepareStatement(sql);
		 
		 ResultSet rs=pst.executeQuery();
		 
		 while(rs.next())
			{
			 	list.add(rs.getInt(1));
				
			}
		
		return list;
	}

}
