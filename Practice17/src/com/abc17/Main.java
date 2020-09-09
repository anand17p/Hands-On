package com.abc17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {

	public static void main(String[] args)throws IOException {
		String stallName;
		Integer cost;
		String ownerName;
		Integer tvSet;
		Integer projector;
		Integer screen;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ChooseStall Type");
		System.out.println("1)Gold Stall\r\n" + 
				"2)Premium Stall\r\n" + 
				"3)Executive Stall\r\n" + 
				"");
		int no=Integer.parseInt(br.readLine());
		switch(no) {
		case 1:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String str=br.readLine();
            String[] details=str.split(",");
            stallName=details[0];
            cost=Integer. parseInt(details[1]);
            ownerName=details[2];
            tvSet=Integer. parseInt(details[3]);
            Stall g=new GoldStall(stallName,cost,ownerName,tvSet);
            g.display();
			break;
		case 2:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String str1=br.readLine();
            String[] details1=str1.split(",");
            stallName=details1[0];
            cost=Integer. parseInt(details1[1]);
            ownerName=details1[2];
            projector=Integer. parseInt(details1[3]);
            PremiumStall g1=new PremiumStall(stallName,cost,ownerName,projector);
            g1.display();
			break;
		case 3:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");	
			String str2=br.readLine();
            String[] details2=str2.split(",");
            stallName=details2[0];
            cost=Integer. parseInt(details2[1]);
            ownerName=details2[2];
            screen=Integer. parseInt(details2[3]);
            ExecutiveStall g2=new ExecutiveStall(stallName,cost,ownerName,screen);
            g2.display();
            break;
	}
		

	}

}
