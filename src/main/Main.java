package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String args[]){
	
	String filename = "test.xml";
	File xmlFile = new File("src/main/output/" + filename);
	Element[] elementArry = new Element[3];
	elementArry[0] = new Element("Name",2,"Clay");
	elementArry[1] = new Element("Age",0,"22");
	elementArry[2] = new Element("Occupation",2,"Badass");
	if(xmlFile.exists()){
		try {
			FileWriter fw = new FileWriter(xmlFile);
			fw.write("<test> \n <Text>this is an xml test</Text> \n");
			
			for(int i = 0; i < elementArry.length;i++){
				
				switch(elementArry[i].getType()){
				
				case 0:
					fw.write("\t<" + elementArry[i].getElementName() + "> \n \t\t" + elementArry[i].getIntValue() + "\n\t</" +elementArry[i].elementName + ">\n");
					break;
				case 1:
					fw.write("\t<" + elementArry[i].getElementName() + "> \n \t\t" + elementArry[i].getDblValue() + "\n\t</" +elementArry[i].elementName + ">\n");
					break;
				case 2:
					fw.write("\t<" + elementArry[i].getElementName() + "> \n \t\t" + elementArry[i].getStrValue() + "\n\t</" +elementArry[i].elementName + ">\n");
					break;
				}
				//fw.write("<" + elementArry[i].getElementName() + "> \n \t" elementArry[i].get );
			}
			
			fw.write("</test>");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
	 try {
		boolean fileStatus = xmlFile.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	//FileWriter fw = new FileWriter("src/main/output/" + filename);
	//xmlFile.create();
	}
}
