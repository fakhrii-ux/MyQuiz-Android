package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Server {

	public static int i=0;
	 public static String correctAnswers[] = {
	            "Google",
	            "Fragment",
	            "TCP",
	            "RemoteException"
	    };
	 public static void main (String [] args) {
		 try {
			 ServerSocket serversocket = new ServerSocket(1235);
			 System.out.println("Server en attend");
			 
			 
			 
			 while(true) {
				 Socket socket =serversocket.accept();
				// System.out.println("exception du msg");
				 InputStream is =socket.getInputStream();
				 InputStreamReader isr = new InputStreamReader(is); 
				 BufferedReader br = new BufferedReader(isr);
				 String s = br.readLine();
				  
				 
				 ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
				 executorService.schedule(() -> {
					 if (s.toString().equals(correctAnswers[i])) {
				 
					 int a = i+1;
					 System.out.println("reponse correcte :"+correctAnswers[i]);
					 System.out.println("reponse choisi :"+s);
					 i++;
					 }
					 else {
						 int a=i+1;
						 System.out.println("reponse correcte :"+correctAnswers[i]);
						 System.out.println("reponse choisi :"+s);
						 i++;
					 }
					 
					 
					 
					 
					 
				 }, 50, TimeUnit.MILLISECONDS);
				 
			 }
		 }catch (IOException e) {
			 e.printStackTrace();
		 }
	 }
}
