/*
 * LOGOS It Academy test file
 * 
 * */

package ua.lviv.lgs.homeworksort;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Integer [] array = new Integer[(int)(10 + Math.random()* 40)];
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int)(10 + Math.random()* 100);
			
		}

		System.out.print(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println();
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		

	}
	
}

