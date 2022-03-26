/*
 * LOGOS It Academy test file
 * 
 * */

package ua.lviv.lgs.homework;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * @param input parameters is Object
		 * @exception no one
		 * */
		
		//Automobile [][] vehicles = new Automobile [getRandomValue(2,10)][2];
		
		Auto [][] cars = new Auto [getRandomValue(2,10)][2];
		
		
		System.out.println("The method of intput a two-dimensional array:");
		
		for(int i = 0; i < cars.length; i++) {
			
			for(int y = 0; y < cars[i].length; y++) {
							
				cars[i][y] = new Auto(getRandomValue(60,125), getRandomValue(1954,2022), new Engine(getRandomCylinders(4,12)), 
					new Wheel(getRandomValue(13, 15), getRandomFabricWheel(getRandomValue(1,4))));   

				System.out.print(" " + cars[i][y] + " ");
				
			}
				System.out.println();	
		}
		
		System.out.println("");
		System.out.println("The second option of output a two-dimensional array throw Arrays.deepToString:");
		
		System.out.println(Arrays.deepToString(cars));
		
		System.out.println("length of row " + cars.length); 
		System.out.println("length of columns " + cars[0].length); 
		
		
		/* to fill in the two dimensional massive with the same value - the first option: */
		
		Arrays.fill(cars, cars[0]);

		System.out.println("");
		System.out.println("the massive - cars - is filled in whith the same value = ");
		System.out.println(Arrays.deepToString(cars));
		
		
		//to fill in two dimensional massive with the same value - the second option: 
		 
		 /* Automobile [] vehicles2 = new Automobile[10];
		  Arrays.fill(vehicles2, new Automobile(new Auto(75, 2017), new Engine(4), new Wheel(14, "alcantara")));
		  Arrays.fill(vehicles, vehicles2);
		  System.out.println("vehicles3 = " + Arrays.toString(vehicles2));
		  */
	
	}
	

	
	/** Methods of generating random values */
	
	public static int getRandomValue(int min, int max) {
		
		if(min >= max) {
			throw new IllegalArgumentException("min value must be smaler then max value");
		}
		
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
	
public static int getRandomCylinders(int min, int max) {
		
		if(min >= max) {
			throw new IllegalArgumentException("min value must be smaler then max value");
		}
		
		Random r = new Random();
		int tmp = r.nextInt(max - min + 1) + min;
		
		if(tmp % 2 == 0) {
			return r.nextInt(max - min + 1) + min;
		} else {
			return getRandomCylinders(min, max);
		}
	}


	public static String getRandomFabricWheel(int id) {
		
		String [] fabric = {"thermovinyl", "alcantara", "leather", "wood", "imitation leather"};
		
		String material = fabric[id];
		
		return material;
	}
	
	
	
	
	
}



