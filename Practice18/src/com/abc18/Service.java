package com.abc18;

class Service implements Car  {
	
	@Override
	public void sum(int sum) {
		if(sum%2==0)
		{
			System.out.println("You can go for servicing on Monday, Wednesday and Friday. ");
		}
		else
		{
			System.out.println("You can go on Tuesday, Thursday and Saturday.");
		}
		
	}
	@Override
	public void years(int years) {
		if(years<5)
		{
			System.out.println("You are eligible for free washing . ");
		}
		else
		{
			System.out.println("You are not eligible for free washing .");
		}
		
		
	}
	@Override
	public void brand(String brand) {
		if("maruthi".equalsIgnoreCase(brand))
		{
			System.out.println("Your servicing charges are is 4750 ");
		}
		else
		{
			System.out.println("Your servicing charges are is 5000");
		}
		
	}

}
