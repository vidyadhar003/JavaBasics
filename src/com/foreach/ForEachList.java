package com.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("vidyadhar");
		list.add("Jagadale");
		list.add("Sachin");
		list.add("Sadar");
		
		for(String str:list){
			
			System.out.println(str);
		}
		
	}
}
