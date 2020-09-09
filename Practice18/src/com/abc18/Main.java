package com.abc18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws IOException {
		int m, n,m1, sum = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Service c=new Service();
        System.out.println("Enter your car number");
        m=Integer.parseInt(br.readLine());
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        c.sum(sum);
        System.out.println("How many years old car do you have-");
        m1 =Integer.parseInt(br.readLine()); 
        c.years(m1);
        System.out.println("Car Barnd-");
        String brand = br.readLine();
        c.brand(brand);
        
	}

}
