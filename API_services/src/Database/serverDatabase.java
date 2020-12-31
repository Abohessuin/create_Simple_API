package Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Message;

public class serverDatabase {
	private static Map<Integer,Message>Msg;
     
     public serverDatabase() {
    	 Msg=new HashMap<Integer,Message>();
     }

	public static Map<Integer, Message> getMsg() {
		return Msg;
	}

	public static void setMsg(Map<Integer, Message> msg) {
		Msg = msg;
	}
	

	
     
     
}
