package com.example.andenginetest;

import android.util.Log;



public class GetBoundary {
	
	
	public static int []  giveMeTheCoordinates (int playerNo) {
		
		
		   int WIDTH=640;
		 int HEIGHT=390;

		
		
		
		int midX = WIDTH/2;
		int midY = HEIGHT/2;
		int margin =20;
		
		
		 int [][] allBoundries = { 
				
				{  midX- 65,margin,midX+65,margin  },
				{ WIDTH-margin*2,midY-65,WIDTH-margin*2,midY+65},
				{  midX-65,HEIGHT-margin,midX+65,HEIGHT-margin },
				{  margin*2,midY-65,margin*2,midY+65 }
				
		};
		int [] values  = {0,0,0,0};
		
		for (int i=0; i<4;i++) {
			values[i]  = allBoundries[playerNo][i];
		
			
		}
		
		return values;//returns boundries of all eachplayers
		
	}

}
