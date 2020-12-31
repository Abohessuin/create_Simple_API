package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Database.serverDatabase;
import model.Message;
import model.Responce;
import model.Topic;
@Path("/msg")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class API  implements API_Service{
	private static serverDatabase SD=new serverDatabase();

	@Override
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String TestApi() {
		return "Hello world";

	}

	@Override
	@POST
	@Path("/add")
	public Responce postMSG(Message msg) {
		System.out.println("hey");
		Responce response = new Responce();
		if(SD.getMsg().get(msg.getId()) != null){
			response.setStatus(false);
			response.setMessage("Person Already Exists");
			return response;
		}
		HashMap<Integer,Message>s=(HashMap<Integer, Message>) serverDatabase.getMsg();
		s.put(msg.getId(), msg);
		serverDatabase.setMsg(s);
		response.setStatus(true);
		response.setMessage("Person created successfully");
		return response;
	}

	@GET
	@Path("/getAll")
	public ArrayList<Message> getAllPersons() {
		HashMap<Integer,Message>test=(HashMap<Integer, Message>) serverDatabase.getMsg();
		ArrayList<Message> test2 = new ArrayList<>();

		 Iterator iterator = test.entrySet().iterator();
	        while (iterator.hasNext()) {
	             Map.Entry me2 = (Map.Entry) iterator.next();
	             test2.add((Message) me2.getValue());
	        }
		return test2;



	}

	
	@Override
	@GET
	@Path("/{id}/Dummy")
	public Message certienMSG(@PathParam("id") int ID) {
		System.out.println("hey");
		return SD.getMsg().get(ID);
	}





}
