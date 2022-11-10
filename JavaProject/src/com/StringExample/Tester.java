package com.StringExample;

public class Tester {
	static String moveSpecialCharacters(String str) {
		int len = str.length();
		String spchar = "[a-zA-z0-9//s++]";
//		String spchar = "[A-za-z0-9//s++]";
//		String spchar = "[A-za-z//s++]";

		String r1 = "", r2 = "";
		// String r2="";
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);

			if (String.valueOf(c).matches(spchar)) {
				r1 = r1 + c;
			} else {
				r2 = r2 + c;
			}
		}
		return r1 + r2;
	}

	public static void main(String[] args) {
		String s1 = "He@$llo!*&";
		// converts Hello@$!*&
		System.out.println(moveSpecialCharacters(s1));
		String s2 = "%$we*l#co?,me;";
		// welcome%$*#?,;
		System.out.println(moveSpecialCharacters(s2));
	}
}
