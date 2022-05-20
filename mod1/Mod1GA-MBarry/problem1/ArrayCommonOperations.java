/**
* @author EMILIA BUTU
* version 1.0
* since   2020-07
*
* Student name:  Michael Barry
* Completion date: 19 May 2022
*
* ArrayCommonOperations.txt - template file. Save as ArrayCommonOperations.java
*
* This program performs common operations on the elements of an one-dimensional array
* The elemenst of the array are random numbers of type integer, with values between 1 and 100.
* The calculated values are stored, and displayed at the end of the program
*
* Student tasks: complete tasks specified in the file
*/

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayCommonOperations
{

    public static void main(String [] args)
    {

		//*** Task #1: Define and instantiate an array of integer numbers, with 10 elements
      int[] nums = new int[10];

		//*** Task #2: Fill in the array with integer numbers from 1 to 100

      for (int i = 0; i < 100; i++) {
        try {
          nums[i] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        } catch(Exception ArrayIndexOutOfBoundsException) {
          nums = Arrays.copyOf(nums, (nums.length + 10));
          nums[i] = i+1;
        }

      }

		//*** Task #3: 	define another array, named temp, and copy the initial array in it.
		//*				This allows to preserve the original array
      int[] temp = nums;


		//*** Task #4:  Define the variables you need to calculate the following values,
		//*				and initialize them with appropriate values.


		//*** Task #5: 	Print the original array
      System.out.println("Original Array: " + Arrays.toString(nums));

		//*** Task #6: 	Calculate the sum of all values
      int sum = 0;
      for (int i = 0; i < temp.length; i++) {
        sum += temp[i];
      }

		//*** Task #7: 	Count the number of even values
      int numEvenVals = 0;
      for (int i = 0; i < temp.length; i++) {
        if(temp[i]%2 == 0) {
          numEvenVals++;
        }
      }
		//*** Task #8: 	Calculate the minimum value in the array
      int min = temp[0];
      for (int i = 0; i < temp.length; i++) {
        if(temp[i]< min) {
          min = temp[i];
        }
      }

		//*** Task #9: 	Calculate the maximum value in the array
      int max = temp[0];
      for (int i = 0; i < temp.length; i++) {
        if(temp[i] > max) {
          max = temp[i];
        }
      }

		//*** Task #10: Replace the elements that are divisible by 3, with their value plus 2

    for (int i = 0; i < temp.length; i++) {
      if(temp[i]%3 == 0) {
        temp[i] += 2;
      }
    }


		//*** Task #11: Display the new array after replacement
    System.out.println("New array after replacement: " + Arrays.toString(temp));

		//*** Task #12: Display the calculated values.
    System.out.println("Sum of all values: "+sum+"\n"+"Number of even values: "+numEvenVals+"\n"+"Minimum: "+min+"\n"+"Maximum: "+max+"\n");

    }
}
