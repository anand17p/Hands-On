package com.abc30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)throws NumberFormatException, IOException {
		String name;
		String detail;
		String ownerName;	
		Long typeId;
		Long id	;
		ArrayList<Event>list=new ArrayList<Event>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number of the events:");
		 int eno=Integer.parseInt(br.readLine());
		 for(int i=0;i<eno;i++)
		 {
			 System.out.println("Enter the details of event "+(i+1));
		     String str=br.readLine();
		     String[] details=str.split(",");
		     name=details[0];
		     detail=details[1];
		     ownerName=details[2];
		     typeId=Long.parseLong(details[3]);
		     try {
		    	 if(typeId>3) {
		    		throw new Exception("EventTypeDoesNotExistsException: No event type available with the given id"); 
		    	 }
		     }
		     catch(Exception ex)
		     {
		    	 System.out.println(ex.getMessage());
		    	 System.exit(0);
		         
		     }
		     Event e=new Event(name,detail,ownerName,typeId);  
		     list.add(e);
		 }
		 System.out.format("%-15s%-15s%-15s%-15s\n","Name","Details","Owner name","Eventtypeid ");
		 for (Event e : list) {
		     System.out.format("%-15s%-15s%-15s%-15s\n",e.getName(),e.getDetail(),e.getOwnerName(),e.getTypeId());
			
		 }
		 
	 }

}

