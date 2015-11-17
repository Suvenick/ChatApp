
public class ClientThread implements Runnable {

	
	public void run() {
		String msg ;
		try{
			while((msg = Client.reader.readLine())!=null){
				FrameCLie.txtrText.append(msg+"\n");
			}
		}catch(Exception ex){}
		
	}

}
