package com.bptn.course._20_jdbc_in_depth;

import java.io.IOException;
import java.nio.file.*;
import java.util.UUID;

public class FileDemo {
	
	private static String HOME = System.getProperty("user.home");

	public static void main(String[] args) {
		  // All the name elements in the path must exist, apart from the file name, otherwise, we will get an IOException:
		  String fileName = "myfile_" + UUID.randomUUID().toString() + ".txt";
		  Path p = Paths.get(HOME + "/" + fileName);
		  if(!Files.exists(p)){
		      try {
		    Files.createFile(p);
		   } catch (IOException e) {
		    e.printStackTrace();
		   }    
		  }
//		  System.out.println(Files.exists(p));
		  
		  if(Files.exists(p)){
		        Scanner scanner = new Scanner(new File(p.toUri()));
		        while (scanner.hasNextLine()) {
		            String data = scanner.nextLine();
		            System.out.println("Data available in file :" + data);
		        }
		    }
		 }

}
