package app;

import java.util.ArrayList;

import model.Message;
import model.Topic;

public interface API_Service {
	public String TestApi();
    public String postMSG(Message msg);
    public ArrayList<Message> listMSG(Topic topic);
    public Message certienMSG(String ID);
    public ArrayList<Topic>listTopics();
    
}
