package com.shalini.source;

import java.util.ArrayList;

public class AddNumbers {

	public int add(String string) throws Exception {
		int sum =0;
		if (string.isEmpty()) {
            return sum;
        }
		String delimiter = ",|\n";
		String[] nums = string.split(delimiter);
		  for (String num : nums) {
	            int n = Integer.parseInt(num);
	            sum += n;
	        }

		return sum;
		
     }
	
}