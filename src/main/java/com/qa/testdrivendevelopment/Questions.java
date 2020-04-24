package com.qa.testdrivendevelopment;

import java.util.Arrays;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and
	 * generates a 2-dimensional array. The element value in the i-th row and j-th
	 * column of the array should be i*j. <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1. <br>
	 * <br>
	 * For Example: <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]] <br>
	 * multiply(2,1) → [[0,0]] <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays) {
		int[][] arr = new int[numOfArrays][arrayLength];
		
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b < arr[a].length; b++) {
				arr[a][b] = a*b;
			}
		}
		return arr;
	}

	/**
	 * Write a function that accepts a comma separated sequence of words as input
	 * and prints the words in a comma-separated sequence after sorting them
	 * alphabetically.
	 * 
	 * For Example: sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		String[] sorted = Arrays.stream(wordSequence).sorted().toArray(String[]::new);

		return sorted;
	}

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is
	 * 2468.
	 * 
	 * For Example: aPlus(5) → 6170 aPlus(9) → 11106
	 */
	public int aPlus(int num) {
		int num2 = Integer.parseInt(num + "" + num);
		int num3 = Integer.parseInt(num + "" + num + "" + num);
		int num4 = Integer.parseInt(num + "" + num + "" + num + "" + num);
		return num + num2 + num3 + num4;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and
	 * returns all the odd numbers as a string, separated by commas. If there are no
	 * odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should
	 * also be given in ascending order.
	 * 
	 * For Example: oddNum("1,2,3,4,5") → "1,3,5" oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		String[] nums = allNums.split(",");
		StringBuilder sb = new StringBuilder();

		for (String n : nums) {
			if (Integer.valueOf(n) % 2 != 0) {
				sb.append(n + ",");
			}
		}

		if (sb.length() != 0) {
			return sb.toString().substring(0, sb.length() - 1);
		}
		return null;

	}

	/**
	 * Define a function that can accept two strings as input and returns the string
	 * of largest length
	 * 
	 * If two strings have the same length, then the function should return both
	 * strings separated by a single space. In this case, the strings should be
	 * returned in the same order in which they were given.
	 * 
	 * For Example: longString("hi","hello") → "hello" longString("three", "two") →
	 * "three" longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		int a = input1.length();
		int b = input2.length();

		if (a == b) {
			return input1 + " " + input2;
		} else if (a > b) {
			return input1;
		} else {
			return input2;
		}
	}

	/**
	 * Given an email address person@company.com, and a parameter "person" or
	 * "company", write a function which returns the corresponding piece of
	 * information. Your function should ignore case.
	 * 
	 * For Example: email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft" email("Dave@amazon.com",
	 * "person") → "dave"
	 */
	public String email(String email, String parameter) {
		String[] info = email.split("@");

		if (parameter.equalsIgnoreCase("person")) {
			return info[0].toLowerCase();
		} else {
			return info[1].substring(0, info[1].length() - 4).toLowerCase();
		}
	}

	/**
	 * The fibonacci sequence is the sum of the last two numbers, with index 0 and 1
	 * having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example: fibbonaci(0) → 0 fibbonaci(1) → 1 fibbonaci(2) → 1 fibbonaci(3)
	 * → 2 fibbonaci(4) → 3 fibbonaci(5) → 5 fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		if(num == 0) {
			return 0;
		} else if(num == 1 || num == 2) {
			return 1;
		}
		for(int i = 1; i < num; i++) {
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}

		return num3;
	}

	/**
	 * Write a function which, given a string input, returns a string which contains
	 * only the characters with odd indexes.
	 * 
	 * For Example: oddLetters("Sponge") → "pne" oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			if (i % 2 != 0) {
				output += input.charAt(i);
			}
		}
		return output;
	}

	/**
	 * Write a function which solves the following puzzle. A farm has chickens and
	 * rabbits, and scanners are able to detect the number of heads and legs. How
	 * many chickens do we have, if we know the number of heads and legs? The values
	 * for 'heads' and 'legs' will be inputs. If there are no solutions to the
	 * puzzle, return null
	 * 
	 * For Example: chickenAndRabbits(35, 94) → 23 chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {
		int sum = legs - (heads * 2);
		int rabbits = sum / 2;
		int chickens = heads - rabbits;

		if (chickens < 1) {
			return null;
		}
		return chickens;
	}

	/**
	 * Write a function which checks the validity of a credit card number. The
	 * function should return a boolean, True if the card is valid, or False if it
	 * is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria. - it
	 * must start with a 4, 5 or 6. - it must contain exactly 16 digits. - each
	 * digit must be 0-9 inclusive. - it may contain hyphens ("-"), to separate
	 * groups of 4 digits only, but it cannot contain any other characters. - it
	 * must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example: validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False validCard("4444-0123-4567-8901") →
	 * False validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		String card = cardNumber.replace("-", "");

		if (card.length() != 16) {
			return false;
		}
		switch (Integer.valueOf(card.substring(0, 1))) {
		case 4:
		case 5:
		case 6:
			break;
		default:
			return false;
		}

		for (int a = 0; a < card.length(); a++) {
			int count = 0;
			for (int b = 0; b < card.length(); b++) {
				if (card.charAt(a) == card.charAt(b)) {
					count++;
					if (count >= 4) {
						return false;
					}
				}
			}
		}

		return true;
	}
}