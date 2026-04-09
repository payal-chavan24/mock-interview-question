package com.arrayquestion;

public class SeparealphabetNumber {
	public static void main(String[] args) {
		String str = "payalChavan@123@#";
		String alph = "";
		String num = "";
		String specialchar = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				alph = alph + ch[i];
			} else if (ch[i] >= '0' && ch[i] <= '9') {
				num = num + ch[i];

			} else {
				specialchar = specialchar + ch[i];

			}

		}
		System.out.println("Alphabet =" + alph);
		System.out.println("number =" + num);
		System.out.println("specialchar =" + specialchar);

	}
}
