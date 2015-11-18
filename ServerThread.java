import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread implements Runnable {
	BufferedReader reader;
	
	ServerThread(Socket sock){
		InputStreamReader is;
		try {
			is = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void run() {
		String msg;
		try{
			while((msg = reader.readLine())!=null){
				System.out.println(msg);
				
			}
		}catch(Exception ex){}
		
	}

}
