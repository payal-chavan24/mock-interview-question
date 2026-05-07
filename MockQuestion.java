package com.streamApi;

import java.util.stream.IntStream;

public class Mock_Question {
	public static void main(String[] args) {
		String str = "Payal.chavan2021@gmail.com";
		// first will separte letter
		// create on temp varrible
		String letter = str.chars().filter(c -> (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
				.mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> a + b);
		System.out.println("Letter =" + letter);
		// steps first first through chars method we get ascill value of thosean then we
		// will use filter so we only want letter and after this
		// mapToObject method it will convert into number to char and char to string
		// throught reduce method it will add element like before it was empty "" after
		// it will hava P then alike this this will have store in letter variable then
		// we will print it
		String number = str.chars().filter(c -> (c >= '0' && c <= '9')).mapToObj(c -> String.valueOf((char) c))
				.reduce("", (a, b) -> a + b);
		System.out.println("Number =" + number);

		String special_char = str.chars()
				.filter(c -> !((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')))
				.mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> a + b);
		System.out.println("Special charcter = " + special_char);

	}
}
