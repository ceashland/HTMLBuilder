package websiteObj;

public class EnhancedTag extends Tag{

	String content;
	
	public EnhancedTag(String type, String cont){
		
		type.toLowerCase();
		
		if(type == "title"){
			setType(type);
			setContent(getType(),cont);
		}else if(type == "script"){
			setType(type);
			setContent(getType(),cont);
		}else if(type == "link"){
			setType(type);
			setContent(getType(),cont);
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
		
		if(type == "title"){
			this.content = "<title>" + content + "</title>";
		}else if(type.isEmpty() || type == null){
			this.content = content;
		}else if(type == "script"){
			this.content = "<script src=\""+content+"\"" +"</script>";
		}else if(type == "link"){
			this.content = "<link rel=\"stylesheet\" type=\"text/css\" href=\""+content+"\"" +"</link>";
		}else{
			System.out.println("Wrong tag created");
			return;
		}
	}
	
	
}



