package com.cg.orb.ui;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.orb.dto.RoomRegistration;
import com.cg.orb.service.IRoomRegistrationService;
import com.cg.orb.service.RoomRegistrationServiceImpl;
import com.cg.org.dbutil.DBUtil;

public class Client 
{

	static IRoomRegistrationService service=null;
	static RoomRegistration details = null;
	static int res;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException, SQLException 
	{
		
		System.out.println("      Hotel Room Registration Application       ");
		System.out.println("------------------------------------------------");
		while(true)
		{
			System.out.println("1.Booking Room");
            System.out.println("2. Exit");
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				registerRoom();
				break;
			case 2:
				
				break;
		
	}

 }
	}
	private static void registerRoom()
	{
		try 
		{
			service = new RoomRegistrationServiceImpl();
			
			ArrayList<Integer> list;
	    	list =service.getAllOwnerIds();
            System.out.println("Existing HotelOwner IDS Are:-"+list);
            
        
			System.out.println("Please enter your hotel owner id from above list:-");
			int id = sc.nextInt();
			
			System.out.println("Select  room type Type (1-1AC, 2-2NON-AC):");
			int roomType = sc.nextInt();
			System.out.println("Enter room area in sq. ft.:");
			int roomArea = sc.nextInt();
			System.out.println("Enter desired rent amount Rs: ");
			int rentAmount = sc.nextInt();
			System.out.println("Enter desired paid amount Rs: ");
			int paidAmount = sc.nextInt();
			
			details = new RoomRegistration(id,roomType,roomArea,rentAmount,paidAmount);
			
			int res = service.registerRoom(details);
			
			System.out.println("Room successfully registered. Room no:<"+res+">");


		} 
		
		catch (IOException | SQLException e)
		{
			
			e.printStackTrace();
		}
		
		


	}
}


















