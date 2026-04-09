package com.arrayquestion;

import java.util.Scanner;

public class SepartedVowelConsonats {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array ");
		int size = sc.nextInt();
		sc.nextLine();
		String array[] = new String[size];
		System.out.println("Enter elemnts in array");
		int res = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextLine();
			// System.out.println(array[i]);
		}
		for (String s : array) {
			System.out.println(s);
			int vowel = 0;
			int consonants = 0;
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
					vowel++;

				} else if (ch != ' ') {
					continue;

				} else {
					consonants++;
				}

			}
			System.out.println("vowel count =" + vowel);
			System.out.println("consonants count =" + consonants);
			res = vowel * consonants;
			char ch1 = (char) res;
			System.out.println(ch1);

		}
		sc.close();
	}

}
