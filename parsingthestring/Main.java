package com.egen.session1.vihar.parsingthestring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String args[]) throws FileNotFoundException {
		Parsing parse = new Parsing();
		parse.parses(
				"Vihar Doshi,5820 H st,999-999-9999,16,25");
	}

}
