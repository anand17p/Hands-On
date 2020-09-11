package com.abc4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] arr= {" name","country","skill"};;
		Scanner sc=new Scanner(System.in);
		Player p=new Player();
		System.out.println("Enter the Player details");
		String str = sc.nextLine();
		String[] details = str.split(",");
		for(int i=0;i<details.length;i++)
		{
			arr[i]=details[i];
		}
		p.setName(arr[0]);
		p.setCountry(arr[1]);
		p.setSkill(arr[2]);
		System.out.println("Player details ");
		System.out.println("Player name :"+p.getName());
		System.out.println("Country name  :"+p.getCountry());
		System.out.println("Skill :"+p.getSkill());

	}

}
