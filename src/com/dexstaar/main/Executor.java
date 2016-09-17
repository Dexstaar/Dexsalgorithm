package com.dexstaar.main;

import com.dexstaar.algorithm.*;
import com.dexstaar.algorithm.Array.ReverseWords;

public class Executor {

	public static void main(String[] args) {

		String input = "Do or do not. there is no try.";

		ReverseWords reverseWords = new ReverseWords();

		System.out.println( reverseWords.getReversedWords(input) );
	}

}
