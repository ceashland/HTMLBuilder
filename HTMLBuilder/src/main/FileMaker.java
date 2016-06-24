package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import websiteObj.Page;

public class FileMaker {

	String path, name;
	public String HOME = System.getProperty("user.home");
	public File DESKTOP = new File(HOME, "Desktop");
	BufferedWriter output = null;
	File fileWrite;
	public FileMaker(){
		fileWrite = new File(DESKTOP,"blank.html");
		if(!new File(DESKTOP,"blank.html").exists()){
			try {
				output = new BufferedWriter(new FileWriter(fileWrite));
			}catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Stuff");
				e.printStackTrace();
			}
		}else{
			System.out.println("Stuff");
			fileWrite.delete();
			System.out.println(fileWrite.exists());
			
			
			try {
				output = new BufferedWriter(new FileWriter(fileWrite));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//path = "";
	}
	
	public void makeFile(String pathName, String fileName){
		// 
		
			System.out.println("Doesn't exist");
			
			if(!pathName.contains(HOME)){
				System.out.println("File does not contain proper pathname");
				return;
			
			}
				
				if(!new File(pathName).exists()){
					new File(pathName).mkdirs();
					try {
						output = new BufferedWriter(new FileWriter(new File(pathName,fileName)));
						output.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					try {
						output = new BufferedWriter(new FileWriter(new File(pathName,fileName)));
						output.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("Stuff");
						e.printStackTrace();
					}
					
				}
			
		}
	
	public void writeToHTML(Page pg){
		
		try {
			output.write(pg.getContent());
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fileWrite.delete();
			System.out.println("Stuff");
			this.writeToHTML(pg);
			//e.printStackTrace();
		}
		
	}
	
	public FileMaker(String p, String fileName){
	
		if(p == "" || p == null){
			File fileWrite = new File(DESKTOP,"blank.txt");		
		}else{
		
		File fileWrite = new File(p, fileName);
			
		if(!fileWrite.exists()){
			//try {
				//output = new BufferedWriter(new FileWriter(fileWrite));
				//output.write("I'm blank");
				//output.close();
			//}catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
		//}else{
			
		}
		//path = "";
		}
	}
}
