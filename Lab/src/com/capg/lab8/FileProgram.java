package com.capg.lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) {
		
		 FileInputStream fis;
         FileOutputStream fos;
         try {
        	 
			 fis = new FileInputStream("source.txt");

	   	     fos = new FileOutputStream("target.txt");
	   	     
	   	     CopyDatathread obj = new CopyDatathread(fis,fos);
	   	   
		} 

         catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
