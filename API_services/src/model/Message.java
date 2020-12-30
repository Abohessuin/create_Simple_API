package model;

public class Message {
	private String id;
	private String timestamp;
	private String topic_ID;
	private String sender_ID;
	private String content;
	
	public Message(String id, String timestamp, String topic_ID, String sender_ID, String content) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.topic_ID = topic_ID;
		this.sender_ID = sender_ID;
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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


}
