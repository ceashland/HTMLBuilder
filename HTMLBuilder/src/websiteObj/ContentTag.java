package websiteObj;

public class ContentTag extends Tag{

	
	String content;
	
	public ContentTag(String type, String cont){
		type.toLowerCase();
		if(type == "paragraph"){
			setType(type);
			setContent(getType(),cont);
		}else if(type.isEmpty() || type == null){
			setType("text");
			setContent(cont);
		}else if(type == "img"){
			setType(type);
			setContent(getType(),cont);
			System.out.println("new image");
		}else if(type == "link"){
			setType(type);
			setContent(getType(),cont);
		}else{
			System.out.println("Wrong tag created");
			return;
		}
		
	}
	
	public ContentTag(String type, String id, String cont){
		type.toLowerCase();
		if(type == "paragraph"){
			setType(type);
			setContent(getType(),id,cont);
		}else if(type.isEmpty() || type == null){
			setType("text");
			setContent(cont);
		}else if(type == "img"){
			setType(type);
			setContent(getType(),id,cont);
		}else if(type == "link"){
			setType(type);
			setContent(getType(),id,cont);
		}else{
			System.out.println("Wrong tag created");
			return;
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setContent(String type, String content) {
		
		if(type == "paragraph"){
			this.content = "<p>" + content + "</p>";
		}else if(type.isEmpty() || type == null){
			this.content = content;
		}else if(type == "img"){
			this.content = "<img src=\""+content+"\"" +"</img>";
		}else if(type == "link"){
			this.content = "<a href=\""+content+"\"" +"</a>";
		}else{
			System.out.println("Wrong tag created");
			return;
		}
	}
	
public void setContent(String type,String id, String content) {
		
		if(type == "paragraph"){
			this.content = "<p id=\""+ id +"\">" + content + "</p>";
		}else if(type.isEmpty() || type == null){
			this.content = content;
		}else if(type == "img"){
			this.content = "<img id=\""+ id +"\" src=\""+content+"\"" +"</img>";
		}else if(type == "link"){
			this.content = "<a id=\""+ id +"\" href=\""+content+"\"" +"</a>";
		}else{
			System.out.println("Wrong tag created");
			return;
		}
	}
	
}
