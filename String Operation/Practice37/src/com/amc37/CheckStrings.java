package com.amc37;
import java.lang.*;

public class CheckStrings {
	public String insertData(String s1,String s2,int pos) {
		StringBuffer str=new StringBuffer(s1);
		str.insert(pos-1,s2+" ");
		return str.toString();
	}

}
