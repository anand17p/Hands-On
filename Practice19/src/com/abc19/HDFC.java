package com.abc19;

public class HDFC implements MutualFund {

	@Override
	public void amount(int x, int y) {
		int amt=(int) (x*y*0.49);
		System.out.println("You will have returns as-"+amt+"/- In "+y+" years");
	}

	
}
