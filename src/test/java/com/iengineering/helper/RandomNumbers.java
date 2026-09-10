package com.iengineering.helper;

import java.util.Random;

public class RandomNumbers {
	
	public static int RandomNumberGenerator(int min, int max)
	{
		Random random = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		return random.nextInt((max - min) +1) + min;
	}

}
