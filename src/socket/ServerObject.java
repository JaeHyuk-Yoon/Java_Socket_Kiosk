package socket;

import java.net.Socket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

public class ServerObject {

	private ServerSocket serverSocket;
	private List <HandlerObject> list;
	
	public ServerObject() {
		try{
			serverSocket= new ServerSocket (9500);
			System.out.println("서버 준비 완료");
			list = new  ArrayList<HandlerObject>();
			while(true){
				Socket socket = serverSocket.accept();
				HandlerObject handler = new  HandlerObject(socket,list);  //스레드를 생성한 것이랑 동일함! 떄문에 시자해주어야 
				handler.start();  //스레드 시작- 스레드 실행
				list.add(handler);  //핸들러를 담음( 이 리스트의 개수가 클라이언트의 갯수!!)
			}//while
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ServerObject();
	}

}

