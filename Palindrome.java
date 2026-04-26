public class Palindrome{
  public static void main (String args){
ArrayList<String> nonPali = new ArrayList<>();
		ArrayList<String> pali = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();

		list.add("payal");
		list.add("madam");
		list.add("aba");
		list.add("sneha");

		// System.out.println(list);

		for (String string : list) {
			String temp = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				char ch = string.charAt(i);
				temp = temp + ch;
			}
			if (string.equals(temp)) {
				pali.add(string);

			} else {
				nonPali.add(string);
			}
		}
		System.out.println("palindrome strings =" + pali);
		System.out.println("Non palindrome strings=" + nonPali);
	}
}
}
