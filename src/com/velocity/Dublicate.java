package com.velocity;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dublicate 
{

	public static void main(String[] args)
	{
		String str = "hello i love java";
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		Set<Character> dublicate = new LinkedHashSet<Character>();
		for(char c : ch)
		{
			if(!set.add(c)&& c!= ' ')
			{
				dublicate.add(c);
			}
		}
		System.out.println(dublicate);

	}

}

