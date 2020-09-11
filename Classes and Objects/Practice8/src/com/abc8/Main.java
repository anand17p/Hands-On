package com.abc8;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 long over;
		 long ball;
		 String wicketType;
		 String playerName;
		 String bowlerName;
		 ArrayList<Wicket>list=new ArrayList<Wicket>();
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the no of Wickets");
		 int eno=Integer.parseInt(br.readLine());
		 for(int i=0;i<eno;i++)
		 {
			 System.out.println("Enter the details of wicket "+(i+1));
		     String str=br.readLine();
		     String[] details=str.split(",");
		     over=Long.parseLong(details[0]);
		     ball=Long.parseLong(details[1]);
		     wicketType=details[2];
			 playerName=details[3];
			 bowlerName=details[4];
			 Wicket w=new Wicket(over,ball, wicketType,playerName,bowlerName);
			 list.add(w);
			 	
		 }
		
		 for (Wicket w : list) {
		      System.out.println("Wicket Details\r\n" + 
		      		"Over : " + w.getOver()+
		      		"\nBall : " + w.getBall()+
		      		"\nWicket Type : " + w.getWicketType()+
		      		"\nPlayer Name : " + w.getPlayerName()+
		      		"\nBowler Name : " + w.getBowlerName()+
		      		"");
		    
		     
	}

}
}

