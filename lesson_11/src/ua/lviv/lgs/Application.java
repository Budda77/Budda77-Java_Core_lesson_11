package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
	// Arrays.deepToString	
		
		int [][] arrayOfIntegers = {{1,2,3},{4,5,6}};
				
		System.out.println(Arrays.deepToString(arrayOfIntegers));
		
		int [][][] arrayOf3D = new int [2][2][4];
		
		System.out.println(Arrays.deepToString(arrayOf3D));
		
		Person [][] arrayOfPersons = {
				{new Person("Andrew", 21), new Person("Bob", 31), new Person("Clara", 41)},
				{new Person("Daniel", 51), new Person("Eva", 61), new Person("Fred", 71)}
		};
		
		System.out.println(Arrays.deepToString(arrayOfPersons));

		
		Person [][] arrayOfPersonsRandom = {
				{new Person("Andrew", getRandomValueFromRange(10, 100)), new Person("Bob", getRandomValueFromRange(10, 100)), new Person("Clara", getRandomValueFromRange(10, 100))},
				{new Person("Daniel", getRandomValueFromRange(10, 100)), new Person("Eva", getRandomValueFromRange(10, 100)), new Person("Fred", getRandomValueFromRange(10, 100))}
		};
		
		System.out.println(Arrays.deepToString(arrayOfPersonsRandom));
		
		boolean [] array1 = new boolean[7];
		
		
	// Arrays fill
	// method .fill - fill in the array with the same value	
		
		Arrays.fill(array1, true);		
		System.out.println("array1 = " + Arrays.toString(array1));
		
		byte [] array2 = new byte[7];
		Arrays.fill(array2, (byte)15);		
		System.out.println("array2 = " + Arrays.toString(array2));
		
		char [] array3 = new char[7];
		Arrays.fill(array3, 'y');		
		System.out.println("array2 = " + Arrays.toString(array3));
		
		int [] array4 = new int[7];
		Arrays.fill(array4, 54);		
		System.out.println("array4 = " + Arrays.toString(array4));
		
		long [] array5 = new long[7];
		Arrays.fill(array5, 88l);		
		System.out.println("array5 = " + Arrays.toString(array5));
		
		String [] array6 = new String[7];
		Arrays.fill(array6, "Test one");		
		System.out.println("array6 = " + Arrays.toString(array6));
		
		Arrays.fill(array6, 2, 4, "Second");
		System.out.println("array6 = " + Arrays.toString(array6));
		
	
		
	// Arrays equals	
		int [] array10 = new int[10];
		int [] array11 = new int[10];
		
		Arrays.fill(array10, 47);
		Arrays.fill(array11, 47);
		System.out.println(Arrays.equals(array10, array11));
		
		array10[2] = 2;
		System.out.println(Arrays.equals(array10, array11));
		
	// Arrays.sort()
		Integer [] array12 = {23,5,984,65,1,4589,26,36,95,87};
		System.out.println("Befor sorting");
		System.out.println(Arrays.toString(array12));
		
		System.out.println("After sorting acscend");
		Arrays.sort(array12);
		System.out.println(Arrays.toString(array12));
		
		System.out.println("After sorting descend");
		Arrays.sort(array12, Collections.reverseOrder());
		System.out.println(Arrays.toString(array12));
		
	// Arrays.binarysearch()
		System.out.println("Binary search");
		Arrays.sort(array12);
		System.out.println(Arrays.toString(array12));
		
		while(true) {
			
			int randomValueIndex = new Random().nextInt(array12.length);
			int randomValue = array12[randomValueIndex];
			
			int location  = Arrays.binarySearch(array12, randomValue); 
			
			if(location >= 0) {
				System.out.println("location of " + randomValue + " is " + location + " , array12[" + location + "]="
						+ array12[location]);
				break;
			}
			
		}
		
		
		
		
	}
	
	
	
	public static int getRandomValueFromRange(int min, int max) {
		
		if(min >= max) {
			throw new IllegalArgumentException("min value must be smaler then max value");
		}
		
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}
