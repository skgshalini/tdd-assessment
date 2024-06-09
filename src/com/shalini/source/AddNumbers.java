package com.shalini.source;

import java.util.ArrayList;

public class AddNumbers {

	public int add(String string) throws Exception {
		int sum =0;
		if (string.isEmpty()) {
            return sum;
        }
		String delimiter = ",|\n";
		String numbersWithoutDelimiter = string;
		  if (numbersWithoutDelimiter.startsWith("//")) {
	            String[] parts = numbersWithoutDelimiter.split("\n", 2);
	            delimiter = parts[0].substring(2);
	            numbersWithoutDelimiter = parts[1];
	        }
		String[] nums = numbersWithoutDelimiter.split(delimiter);
		  for (String num : nums) {
	            int n = Integer.parseInt(num);
	            sum += n;
	        }

		return sum;
		
     }
	
}