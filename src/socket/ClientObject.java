package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientObject /* implements Runnable */ {
	private String serverIP;
	private Socket socket;
	private ObjectInputStream reader=null;
	private ObjectOutputStream writer=null; 
	
	public ClientObject() {
		serverIP = "113.198.235.233";
		service();
	}
	
	public void OrderFrameBtn(){
		try{
			//서버로 보냄 
			//JTextField값을 서버로보내기
			//버퍼 비우기
			InfoDTO dto = new InfoDTO();
			dto.setCommand(Info.ORDER);
			
			writer.writeObject(dto);
			writer.flush();
			
		}catch(IOException io){
			io.printStackTrace();
		}
}
	
	public void service(){
		try{
			socket = new Socket(serverIP,9500);
			//에러 발생
			reader= new ObjectInputStream(socket.getInputStream());
			writer = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("전송 준비 완료!");
			
		} catch(UnknownHostException e ){
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch(IOException e){
			System.out.println("서버와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
//		Thread t = new Thread(this);
//		t.start();
	}
	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		//서버로부터 데이터 받기
//				InfoDTO dto= null;
//				while(true){
//					try{
//						dto = (InfoDTO) reader.readObject();
//						if(dto.getCommand()==Info.ORDER) { //서버로부터 받은 메시지가 "Order"이면
//							
//						}
//					}catch(IOException e){
//						e.printStackTrace();
//					}catch(ClassNotFoundException e){
//						e.printStackTrace();
//					}	
//				}
//	}

	
}
