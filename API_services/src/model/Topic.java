package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="topic") // sending xml
public class Topic {
    private String id;
    private String username;
    public Topic() {
    	
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Topic(String id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	@Override
	public String toString(){
		return id+"::"+username;
	}
}
