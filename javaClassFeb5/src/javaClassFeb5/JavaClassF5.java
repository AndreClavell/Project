package javaClassFeb5;

import java.util.Random;

public class JavaClassF5 {
public static void main(String[] args) {
	//Random & Math APIs
	
		Random myGen;
		myGen = new Random();
		int x = myGen.nextInt(6); 
		int y = myGen.nextInt(6) + 2;// 2 -- 7
		int z = myGen.nextInt(11) -5; // -5 .... +5
		System.out.println("Z is now: " + z);
		System.out.println("Y is now: " + y);
		System.out.println("X is now: " + x);
		
		// Math
		System.out.println(Math.sqrt(44));		
	}
		
}
