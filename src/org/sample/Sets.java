package org.sample;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	
	public static void main(String[] args) {
		
		Set<Float> s=new LinkedHashSet<>();
		
		s.add(12f);
		s.add(12.2f);
		System.out.println(s);
		
		Set<Float> s1=new TreeSet<>();
		
		s1.add(20.99f);
		s1.add(15.34f);
		System.out.println(s1);
	}

}
