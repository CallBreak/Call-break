package com.bipinale;

import java.security.AllPermission;

public class SoltaNamaste {
	
	
	

	
	
	
	
	public static giveMeTheCoordinates (int playerNo) {
		
		
		   int WIDTH=800;
		 int HEIGHT=480;

		
		
		
		int midX = WIDTH/2;
		int midY = HEIGHT/2;
		
		
		 int [][] allBoundries = { 
				
				{  midX- 65,midY/2,midX+65,midY/2  },
				{ WIDTH-midX/3,WIDTH-midY-65,WIDTH-midX/3,midY+65},
				{  midX-65,midY+midY/2,midX+65,midY+midY/2 },
				{  midX/3,midY-65,midX/3,midY+65 }
				
		};
		
		
		for (int i=0; i<4;i++) {
			int a = allBoundries[playerNo][i];
			
			System.out.println(a+"\n");
			
		}
		
	}

}
