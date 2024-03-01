package com.kh.practice01;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		// str 공백을 토큰으로 처리한 문자열 반환
		StringTokenizer tokenizer = new StringTokenizer(str);
		String newStr = "";
		while(tokenizer.hasMoreTokens()) {
			newStr += tokenizer.nextToken();
		}
		
		return newStr.toString();
		
		// return str.replace(" ", "");
	}
	
	public String firstCap(String input) {
//		char[] cArr = input.toCharArray();
//		String s = (cArr[0]+"").toUpperCase();
//		
//		return s + input.substring(1);
		
		if(input == null || input.isEmpty()) { // 입력값이 null일 경우, 앞 뒤 문장 같은 의미
			return input;
		}
		
		String str = (input.substring(0, 1).toUpperCase()) + (input.substring(1));
		//str = input.replaceFirst((input.charAt(0)+""), (input.charAt(0)+"").toUpperCase());
		return str;
	}
	
	public int findChar(String input, char one) {
		int cnt = 0;

//		char[] cArr = input.toCharArray();
//		for(int i = 0; i < cArr.length; i++) {
//			if(cArr[i] == one)
//				cnt++;
//		}

//		for(char c : input.toCharArray()) {
//			if(c == one) {
//				cnt++;
//			}
//		}
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				cnt++;
			}
		}
		
		return cnt++;
	}
	
	
}
