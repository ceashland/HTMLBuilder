package websiteObj;

import java.util.ArrayList;

public class RequiredTag extends Tag{

	
	ArrayList<Tag> contentArry;
	String content;
	
	public RequiredTag(String tagType){
		tagType.toLowerCase();
		setType(tagType);
		contentArry = new ArrayList<Tag>();
		content = "";
	}
	
	public void makeHTML(){
		String tempString = "<" + getType() + ">\n" + getContent()+ "\n</"+ getType() + ">";
		setContent(tempString);
		//addToContent("<" + getType() + ">" + "</"+ getType() + ">");
	}
	
	public String getContent() {
		return content;
	}
	
	public void addToContent(String tex){
		String tempString = getContent() + tex;
		//System.out.println(tempString);
		setContent(tempString);
		//this.setContent(tempString + tex); 
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void buildContent() {
		//this.content = content;
		//System.out.println("Something");
		for(int i = 0; i <= contentArry.size()- 1; i++){
			if(contentArry.get(i).getType() == "body"){
				System.out.println("writing body");
				this.addToContent("<body>");
				for(int i2 = 0; i2 <= ((RequiredTag) contentArry.get(i)).getContentArry().size()-1; i2++){
					if(((RequiredTag)contentArry.get(i)).getContentArry().get(i2).getType() == "paragraph"){
						//System.out.println(((ContentTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
						addToContent("\n" + ((ContentTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
					}else if(((RequiredTag)contentArry.get(i)).getContentArry().get(i2).getType() == "link"){
						addToContent("\n" + ((ContentTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
					}else if(((RequiredTag)contentArry.get(i)).getContentArry().get(i2).getType() == "img"){
						System.out.println("Tag is image");
						addToContent("\n" + ((ContentTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
						System.out.println("Done");
					}if(((RequiredTag)contentArry.get(i)).getContentArry().get(i2).getType() == "text"){
						addToContent("\n" + ((ContentTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
					}
				}
				this.addToContent("\n</body>");
				//makeHTML();
			} else if(contentArry.get(i).getType() == "head"){
				System.out.println("writing head");
				this.addToContent("<head>");
				for(int i2 = 0; i2 <= ((RequiredTag) contentArry.get(i)).getContentArry().size()-1; i2++){
					if(((RequiredTag)contentArry.get(i)).getContentArry().get(i2).getType() == "title"){
						//System.out.println(((ContentTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
						addToContent("\n" + ((EnhancedTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
					}else if(((RequiredTag)contentArry.get(i)).getContentArry().get(i2).getType() == "link"){
						addToContent("\n" + ((EnhancedTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
					}else if(((RequiredTag)contentArry.get(i)).getContentArry().get(i2).getType() == "script"){
						//System.out.println("Tag is image");
						addToContent("\n" + ((EnhancedTag)((RequiredTag)contentArry.get(i)).getContentArry().get(i2)).getContent());
						System.out.println("Done");
					}
				}
				this.addToContent("\n</head>");
			}
			//makeHTML();
		}
		
	}

	public void addContent(Tag tag){
		contentArry.add(tag);
	}

	public ArrayList<Tag> getContentArry() {
		return contentArry;
	}

	public void setContentArry(ArrayList<Tag> content) {
		this.contentArry = content;
	}
}
