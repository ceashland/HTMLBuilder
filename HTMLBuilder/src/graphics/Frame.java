package graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Frame extends JFrame{

	JMenuBar menu;
	
	public Frame(){
		this.setSize(500,500);
		this.setTitle("HTML Builder");
		this.setLayout(null);
		
		JLabel titleField = new JLabel();
		titleField.setText("Title:");
		titleField.setLocation(30,100);
		titleField.setSize(50, 25);
		this.add(titleField);
		
		menu = new JMenuBar();
		JMenu subMenu = new JMenu("File");
		menu.add(subMenu);
		JMenu newFileMenu = new JMenu("New");
		subMenu.add(newFileMenu);
		makeRelatedJMenuItems(newFileMenu,"Project", "New ","Close ");
		//subMenu.add(new HorizontalMenu("File"));
		
		this.add(makeLabel("Testing",70,20,0,0));
		
		//this.add
		this.setJMenuBar(menu);
		this.show();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JLabel makeLabel(String text, int wid, int hei, int x, int y){
		JLabel label = new JLabel();
		if(!text.contains(":")){
			text = text + ":";
		}
		label.setText(text);
		label.setSize(wid,hei);
		label.setLocation(x,y);
		return label;
	}
	
	public JButton makeButton(String text, int wid, int hei, int x, int y){
		JButton button = new JButton();
		if(!text.contains(":")){
			text = text + ":";
		}
		button.setText(text);
		button.setSize(wid,hei);
		button.setLocation(x,y);
		return button;
	}
	
	public void makeRelatedJMenuItems(JMenu jm, String name, String firstAlt, String secondAlt ){
		jm.add(makeJMenuItems(firstAlt + name));
		jm.add(makeJMenuItems(secondAlt + name));
	}
	
	public JMenuItem makeJMenuItems(String tex){
		return new JMenuItem(tex);
	}
	
	public JTextField makeTextField(String text, int wid, int hei, int x, int y){
		JTextField textBox = new JTextField();
		if(!text.contains(":")){
			text = text + ":";
		}
		textBox.setText(text);
		textBox.setSize(wid,hei);
		textBox.setLocation(x,y);
		return textBox;
	}
	
}
