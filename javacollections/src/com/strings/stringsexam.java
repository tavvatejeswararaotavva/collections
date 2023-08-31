package com.strings;

public class stringsexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "helloworld";
		System.out.println(string.length());
		String s1 = "   for coders   ";
		System.out.println(string.concat(s1));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("for"));
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.endsWith("coders"));
		System.out.println(s1.endsWith("for"));
		int result = string.compareTo(s1);
		if (result > 0) {
			System.out.println("string comes BeforeDrag s1");
		} else if (result < 0) {
			System.out.println("s1 comes kbefore string");
		} else {
			System.out.print("two are equal");
		}
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.substring(4));
		System.out.println(s1.replace('o', 'A'));
		System.out.println(s1.trim());
		String[] words = s1.split("\\s+");
		for (String s : words) {
			System.out.println(s);
		}
		System.out.println(words.length);
		System.out.println(string.matches("\\d+"));

		System.out.println(new StringBuilder(string).reverse().toString());
		int count = 0;
		for (char c : s1.toCharArray()) {
			if (c == 'o') {
				count++;
			}
		}
		System.out.println(count);
	}

}
