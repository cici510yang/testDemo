package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Stage1
		print(100);

		// Stage2
//		printStage2(100);

		// test 15
//		print(15);
		
		// test 35
//		printStage2(35);

	}

	// Stage1
	public static void print(int m) {

		for (int i = 1; i <= m; i++) {
			String print = "";

			print = i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : "" + i);
			if (i == 15) {
				assert !print.equals("FizzBuzz") : "Out assertion faild !";
			}
			System.out.println(print);
		}

	}

	// Stage2
	public static void printStage2(int m) {
		String regx = "3";
		String regx1 = "5";
		Pattern pt = Pattern.compile(regx);
		Pattern pt1 = Pattern.compile(regx1);
		for (int i = 1; i <= m; i++) {
			String print = "" + i;

			Matcher mc3 = pt.matcher(print);
			Matcher mc5 = pt1.matcher(print);
			boolean match3 = mc3.find();
			boolean match5 = mc5.find();
			if (match3 && match5) {
				print = "FizzBuzz";
			} else if (match3) {
				print = "Fizz";
			} else if (match5) {
				print = "Buzz";
			} else {
				assert i == 13 : "Out assertion faild !";
				assert i == 35 : "Out assertion faild !";
				assert i == 51 : "Out assertion faild !";
				assert i == 53 : "Out assertion faild !";
				print = i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : "" + i);
			}

			System.out.println(print);
		}

	}

}
