package websiteObj;

import java.util.ArrayList;

public class Page {

	ArrayList<Tag> tagArray;
	String title,content;
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Page(){
	//Creates a blank page
	title = "Blank";
	tagArray = new ArrayList<Tag>();
	tagArray.add(new RequiredTag("html"));
	addRequiredContent((RequiredTag)tagArray.get(0),new RequiredTag("head"));
	addRequiredContent((RequiredTag)tagArray.get(0),new RequiredTag("body"));
	//tagArray.add(new RequiredTag("body"));
		//addRequiredContent((RequiredTag) tagArray.get(0));
	
	addContentToRequiredTag((RequiredTag)((RequiredTag)tagArray.get(0)).getContentArry().get(0),new EnhancedTag("title","TitleThing"));
	addContentToRequiredTag((RequiredTag)((RequiredTag)tagArray.get(0)).getContentArry().get(1),new ContentTag("paragraph","This is a paragraph"));
	addContentToRequiredTag((RequiredTag)((RequiredTag)tagArray.get(0)).getContentArry().get(1),new ContentTag("paragraph","This is another paragraph"));
	addContentToRequiredTag((RequiredTag)((RequiredTag)tagArray.get(0)).getContentArry().get(1),new ContentTag("img","http://serebii.net/sunmoon/popplio.png"));
	//http://serebii.net/sunmoon/popplio.png
	((RequiredTag)tagArray.get(0)).buildContent();
	((RequiredTag)tagArray.get(0)).makeHTML();
	setContent(getPageContent(tagArray));
	//System.out.println(getPageContent(tagArray));
	}
	
	public Page(String title){
		//Creates a blank page
		title = "Blank";
		tagArray = new ArrayList<Tag>();
		this.title = title;
		tagArray.add(new RequiredTag("html"));
		tagArray.add(new RequiredTag("body"));
			//addRequiredContent((RequiredTag) tagArray.get(1));
	}
	
	public void addRequiredContent(RequiredTag tag, RequiredTag tag2){
		RequiredTag tempTag = tag;
		//tempTag.addContent(new ContentTag("paragraph","This is a paragraph"));
		//tempTag.addContent(new ContentTag("paragraph","somethingID","This is a paragraph"));
		tempTag.getContentArry().add(tag2);
		//ContentTag tempTag2 = (ContentTag) (tempTag.getContentArry().get(1));
	
	//System.out.println(tempTag2.getContent());
	}
	
	public void addContentToRequiredTag(RequiredTag tag, Tag tag2){
		RequiredTag tempTag = tag;
		tempTag.getContentArry().add(tag2);
	}
	
	public String getPageContent(ArrayList<Tag> tagArry){
		//System.out.println(tagArray.get(0).getType());
		return ((RequiredTag)tagArry.get(0)).getContent();
	}

	public ArrayList<Tag> getTagArray() {
		return tagArray;
	}

	public void setTagArray(ArrayList<Tag> tagArray) {
		this.tagArray = tagArray;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
