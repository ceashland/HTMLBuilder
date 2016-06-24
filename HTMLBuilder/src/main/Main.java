package main;

import java.io.File;

import websiteObj.Page;
import graphics.Frame;

public class Main {
	public static void main(String args[]){
		Frame frame = new Frame();
		//new FileMaker().makeFile("C:\\Users\\Clay\\Desktop\\Stuff", "stuff.txt");;
		Page p = new Page();
		new FileMaker().writeToHTML(p);
	}
}
