package com.example.andenginetest;

import org.andengine.examples.adt.card.Card;

public class GetCard {
	
	public static Card getcard(int no){//sabai card ko unique number
		
		
		switch (no) {
		
		case 1 : {return Card.HEART_ACE;                 }
		case 2 : {return Card.HEART_ONE;                 }
		case 3 : {return Card.HEART_TWO;                 }
		case 4 : {return Card.HEART_THREE;                 }
		case 5 : {return Card.HEART_FOUR;                 }
		case 6 : {return Card.HEART_FIVE;                 }
		case 7 : {return Card.HEART_SIX;                 }
		case 8: {return Card.HEART_SEVEN;                 }
		case 9 : {return Card.HEART_EIGHT;                 }
		case 10 : {return Card.HEART_NINE;                 }
		case 11 : {return Card.HEART_TEN;                 }
		case 12 : {return Card.HEART_JACK;                 }
		case 13 : {return Card.HEART_QUEEN;                 }
		
		
		
		case 14 : {return Card.CLUB_ACE;                 }
		case 15 : {return Card.CLUB_ONE;                 }
		case 16 : {return Card.CLUB_TWO;                 }
		case 17 : {return Card.CLUB_THREE;                 }
		case 18 : {return Card.CLUB_FOUR;                 }
		case 19 : {return Card.CLUB_FIVE;                 }
		case 20 : {return Card.CLUB_SIX;                 }
		case 21 : {return Card.CLUB_SEVEN;                 }
		case 22 : {return Card.CLUB_EIGHT;                 }
		case 23: {return Card.CLUB_NINE;                 }
		case 24: {return Card.CLUB_TEN ;                 }
		case 25 : {return Card.CLUB_JACK;                 }
		case 26 : {return Card.CLUB_QUEEN;                 }
		
		
		
		case 27 : {return Card.SPADE_ACE;                 }
		case 28 : {return Card.SPADE_ONE;                 }
		case 29 : {return Card.SPADE_TWO;                 }
		case 30 : {return Card.SPADE_THREE;                 }
		case 31 : {return Card.SPADE_FOUR;                 }
		case 32 : {return Card.SPADE_FIVE;                 }
		case 33: {return Card.SPADE_SIX;                 }
		case 34 : {return Card.SPADE_SEVEN;                 }
		case 35: {return Card.SPADE_EIGHT;                 }
		case 36 : {return Card.SPADE_NINE;                 }
		case 37: {return Card.SPADE_TEN;                 }
		case 38: {return Card.SPADE_JACK;                 }
		case 39 : {return Card.SPADE_QUEEN;                 }
		
		
		
		case 40 : {return Card.DIAMOND_ACE;                 }
		case 41 : {return Card.DIAMOND_ONE;                 }
		case 42 : {return Card.DIAMOND_TWO;                 }
		case 43: {return Card.DIAMOND_THREE;                 }
		case 44 : {return Card.DIAMOND_FOUR;                 }
		case 45: {return Card.DIAMOND_FIVE;                 }
		case 46 : {return Card.DIAMOND_SIX;                 }
		case 47 : {return Card.DIAMOND_SEVEN;                 }
		case 48: {return Card.DIAMOND_EIGHT;                 }
		case 49: {return Card.DIAMOND_NINE;                 }
		case 50: {return Card.DIAMOND_TEN;                 }
		case 51: {return Card.DIAMOND_JACK;                 }
		case 52: {return Card.DIAMOND_QUEEN;                 }
		
		}
		return Card.CLUB_ACE;
			
		
	
		
	}

}
