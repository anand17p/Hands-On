package com.abc19;

public class ICICI implements MutualFund  {

	@Override
	public void amount(int x, int y) {
		int amt=(int) (x*y*0.60);
		System.out.println("You will have returns as-"+amt+"/- In "+y+" years");
	}
   

}
