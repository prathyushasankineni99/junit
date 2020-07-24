package com.example.tddjunit;

public class First2AChars {

	public String removeAChars(String string) {
		
		int stringLength=string.length();
		String result="";
		if(stringLength>=2)
		{
		   if(string.charAt(0)!='A')
			   result+=string.charAt(0);
		   if(string.charAt(1)!='A')
			   result+=string.charAt(1);
		   if(stringLength>2)
		   result+=string.substring(2);
		}
		if(stringLength==1)
		{
		   if(string.charAt(0)!='A')
			   result+=string.charAt(0);
		}
		return result;
	}

}
