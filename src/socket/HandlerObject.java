package socket;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HandlerObject extends Thread{
	private ObjectInputStream reader;
	private ObjectOutputStream writer;
	private Socket socket;
	//private InfoDTO dto;
	///private Info command;
	private List <HandlerObject> list;
	//생성자
	public HandlerObject(Socket socket, List <HandlerObject> list) throws IOException {
		
		this.socket = socket;
		this.list = list;
		writer = new ObjectOutputStream(socket.getOutputStream());
		reader = new ObjectInputStream(socket.getInputStream());
		//순서가 뒤바뀌면 값을 입력받지 못하는 상황이 벌어지기 때문에 반드시 writer부터 생성시켜주어야 함!!!!!!
	}
	
	public void run(){
		InfoDTO dto = null;
		try{
			while(true){
				dto=(InfoDTO)reader.readObject();
				
				//System.out.println("배열 크기:"+ar.length);
				//사용자가 접속을 끊었을 경우. 프로그램을 끝내서는 안되고 남은 사용자들에게 퇴장메세지를 보내줘야 한다. 
				if(dto.getCommand()==Info.ORDER){
					InfoDTO sendDto = new InfoDTO();
					sendDto.setCommand(Info.ORDER);
					sendDto.setMessage("Order");
//					writer.writeObject(sendDto);
//					writer.flush();

					
//					reader.close();
//					writer.close();
//					socket.close();
					broadcast(sendDto);
				}
			}//while

		} catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	

	}
	//다른 클라이언트에게 전체 메세지 보내주기
	public void broadcast(InfoDTO sendDto) throws IOException {
		for(HandlerObject handler: list){
			handler.writer.writeObject(sendDto); //핸들러 안의 writer에 값을 보내기
			handler.writer.flush();  //핸들러 안의 writer 값 비워주기
		}
	}
	
	
}
