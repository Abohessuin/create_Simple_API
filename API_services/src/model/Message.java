package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="msg") // sending xml
public class Message {
	private int id;
	private String timestamp;
	private String topic_ID;
	private String sender_ID;
	private String content;
	

	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTopic_ID() {
		return topic_ID;
	}
	public void setTopic_ID(String topic_ID) {
		this.topic_ID = topic_ID;
	}
	public String getSender_ID() {
		return sender_ID;
	}
	public void setSender_ID(String sender_ID) {
		this.sender_ID = sender_ID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	 
	@Override
	public String toString(){
		return id+"::"+timestamp+"::"+topic_ID+"::"+sender_ID+"::"+content;
	}

}
