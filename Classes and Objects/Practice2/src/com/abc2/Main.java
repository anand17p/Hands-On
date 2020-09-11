package com.abc2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String name;
		String country;
		String skill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Player name");
		name=sc.nextLine();
		System.out.println("Enter the Country name");
		country=sc.nextLine();
		System.out.println("Enter the skill");
		skill=sc.nextLine();
		Player p=new Player();
		p.setName(name);
		p.setCountry(country);
		p.setSkill(skill);
		System.out.println("Player details ");
		System.out.println("Player name :"+p.getName());
		System.out.println("Country name  :"+p.getCountry());
		System.out.println("Skill :"+p.getSkill());

	}

}
