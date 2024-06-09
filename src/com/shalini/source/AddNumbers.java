package com.shalini.source;

import java.util.ArrayList;

public class AddNumbers {

	public int add(String string)  {
		int sum =0;
		if (string.isEmpty()) {
            return sum;
        }
		String delimiter = ",|\n";
		String numbersWithoutDelimiter = string;
		StringBuilder negatives = new StringBuilder();
		  if (numbersWithoutDelimiter.startsWith("//")) {
	            String[] parts = numbersWithoutDelimiter.split("\n", 2);
	            delimiter = parts[0].substring(2);
	            numbersWithoutDelimiter = parts[1];
	        }
		String[] nums = numbersWithoutDelimiter.split(delimiter);
		  for (String num : nums) {
	            int n = Integer.parseInt(num);
	            if (n < 0) {
	                negatives.append(num).append(",");
	            }
	            sum += n;
	        }
		  if (negatives.length() > 0) {
	            throw new IllegalArgumentException("negative numbers not allowed " + negatives.toString());
	        }

		return sum;
		
     }
	
}