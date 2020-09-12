package com.abc34;

public class CheckStrings {
     public String stringReverse(String s) {
		 String str="";
    	 for(int i = s.length() - 1; i >= 0; i--)
    	 {
    	 str = str + s.charAt(i);
    	 }
		return str;
}
}
