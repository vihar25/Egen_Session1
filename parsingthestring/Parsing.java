package com.egen.session1.vihar.parsingthestring;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {
	public void parses(String str)
	{
		List<String> strList = new ArrayList<>();
		List<Integer> numList = new ArrayList<>();
		Pattern digitPattern = Pattern.compile("\\d+");
		Matcher matchPattern;
		String[] arr = str.split(",");
		for(String s : arr)
		{
			matchPattern = digitPattern.matcher(s);
			if(matchPattern.matches())
			{
				numList.add(Integer.parseInt(s));
			}
			else
			{
				strList.add(s);
			}
		}
		
		System.out.println("The string list is : "+strList +" \nThe numerical list is : "+numList);
	}
}
