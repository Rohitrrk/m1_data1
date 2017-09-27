package com.cg.org.test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.frs.dao.RoomRegistrationDAOImpl;
import com.cg.orb.dto.RoomRegistration;
import com.cg.org.exception.ExceptionClass;


public class TestClassTest {
	static IRoomRegistrationDAO dao = null;
	static RoomRegistration bean = null;
	
	@BeforeClass
	public static void intialize()
	{
		dao = new RoomRegistrationDAOImpl();
		bean = new RoomRegistration();
	}

	@Test
	public void test() 
	{
		bean.setRoomNo(1020);
		bean.setRoomType(1);
		bean.setRoomArea(5000);
		bean.setRentAmount(6000);
		bean.setPaidAmount(2000);
		
		
	}
	
	@Test
	public void testRoomDetails()
	{
		try {
			assertNotNull(dao.registerRoom(bean));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExceptionClass e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
