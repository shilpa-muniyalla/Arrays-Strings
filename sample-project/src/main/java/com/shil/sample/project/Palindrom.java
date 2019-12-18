package com.shil.sample.project;

public class Palindrom {
	public void checkPalindrom(String name) {

		if (name == null) {
			System.out.println("input is null");
		} else {

			StringBuilder stringBuilder = new StringBuilder();

			for (int i = name.length() - 1; i >= 0; i--) {
				stringBuilder.append(name.charAt(i));

			}

			String reverse = stringBuilder.toString();
			

			if (name.equals(reverse)) {
				System.out.println("this is palindrom : "  +name);
			} else {
				System.out.println("This is not a palindrom: "  +name);
			}
		}

	}

	public static void main(String[] args) {
		Palindrom palindrom = new Palindrom();
		palindrom.checkPalindrom("asa");
	}

}
