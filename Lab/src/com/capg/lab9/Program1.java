package com.capg.lab9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program1 {

	public static void main(String[] args) throws IOException {
		
		
			
			FileReader fr = new FileReader("source.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("target.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			Scanner sc = new Scanner(br).useDelimiter("\\Z");
			
			String contents = sc.next();
			
			
			contents = new StringBuilder(contents).reverse().toString();
			
		
			bw.write(contents);
			
			br.close();
			bw.close();
			
	
		
	}

}
