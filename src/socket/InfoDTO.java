package socket;

import java.util.*;
import java.io.*;

//enum Info {
//	ORDER
//}

public class InfoDTO implements Serializable {
	private String message;
	private Info command;
	
	public Info getCommand(){
		return command;
	}
	public String getMessage(){
		return message;
	}
	
	public void setCommand(Info command){
		this.command= command;
	}
	public void setMessage(String message){
		this.message= message;
	}
}
