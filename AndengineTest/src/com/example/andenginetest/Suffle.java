package com.example.andenginetest;

import java.util.ArrayList;
import java.util.Collections;

import android.util.Log;

public class Suffle  {
	
	public static ArrayList <Integer>getSuffledCards(){
		ArrayList<Integer> tempList;
		ArrayList<Integer> returnList=new ArrayList<Integer>();
		
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		for (int i=0; i <52;i++) 
		{
			list.add(Integer.valueOf(i));
		}
		
		Collections.shuffle(list);
		Collections.shuffle(list);
		
		
		
		int count=0;
		for (int i=0;i<4;i++)
		{
			tempList=new ArrayList<Integer>();
				for(int j=0;j<13;j++)
				{
				
					tempList.add(list.get(count));
					count++;
					
				}
				Collections.sort(tempList);
				
				for(int sortedValue:tempList)
				{
					returnList.add(sortedValue);
				}
				
		}
	
		return returnList;
	}

	
	
	
	
	
}
