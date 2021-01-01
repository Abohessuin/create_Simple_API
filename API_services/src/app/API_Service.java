package app;

import java.util.ArrayList;

import model.Message;
import model.Responce;
import model.Topic;

public interface API_Service {
	
	public String TestApi();
    public Responce postMSG(Message msg);
	public Message certienMSG(int ID);
    
    
}
