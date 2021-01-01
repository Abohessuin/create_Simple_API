package app;

import java.util.ArrayList;

import model.Message;
import model.Topic;

public interface API_Service2 {

	public String TestApi();
    public ArrayList<Message> listMSG(Topic topic);
    public ArrayList<String> listTopics();
}
