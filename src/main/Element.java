package main;

public class Element {

	String elementName;
	int type;
	int intValue;
	double dblValue;
	String strValue;
	
	public Element(String elementNames, int type, String value){
		
		
		
		this.type = type;
		this.elementName = elementNames;
		
		switch (type){
		case 0:
			intValue = Integer.parseInt(value);
			break;
		case 1:
			dblValue = Double.parseDouble(value);
			break;
		case 2:
			strValue = value;
			break;
		}
		
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public double getDblValue() {
		return dblValue;
	}

	public void setDblValue(double dblValue) {
		this.dblValue = dblValue;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
	
}
