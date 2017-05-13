package com.emelwerx.string_compress;

public class Compressor {
	
	public String compress(String source) {
		if(source == null) {
			return "";
		}
		
		if(source.length() < 3) {
			return source;
		}
		
		String result = "";
		char[] charArray = source.toCharArray();
		char currentChar = charArray[0];
		int currentCount = 0;
		
		for(char index : charArray) {
			if(index == currentChar) {
				currentCount++; 
			} else {
				result = result + currentChar + currentCount;
				currentChar = index;
				currentCount = 1;
			}
		}
		
		result = result + currentChar + currentCount;
		
		if(result.length() > source.length()) {
			return source;
		}
		
		return result;
	}

}
