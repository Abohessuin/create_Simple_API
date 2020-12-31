package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Database.serverDatabase;
import model.Message;
import model.Topic;

@Path("/topic")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class API2 implements API_Service2{
	private static serverDatabase SD=new serverDatabase();
	
	
	@Override
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String TestApi() {
		return "Hello world";

	}
	
	@Override
	@GET
	@Path("/Hey")
	public ArrayList<Message> listMSG(Topic topic) {
		System.out.println("topic");
		String topicID=topic.getId();
		System.out.println(topicID);
		HashMap<Integer,Message>s=(HashMap<Integer, Message>) serverDatabase.getMsg();
		ArrayList<Message>ans = new ArrayList<>();
		 Iterator iterator = s.entrySet().iterator();
	        while (iterator.hasNext()) {
	             Map.Entry me2 = (Map.Entry) iterator.next();
	             Message m=(Message) me2.getValue();
	          if(m.getTopic_ID().equals(topicID)) {
	        	  ans.add((Message) me2.getValue());
	          }
	        }
	        System.out.println("heyyyyy");
	        return ans;
	}

	@Override
	@GET
    @Path("/{id}/listtopics")
	public ArrayList<Topic> listTopics() {
		// TODO Auto-generated method stub
		return null;
	}

}
