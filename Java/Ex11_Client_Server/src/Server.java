import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ServerSocket server = new ServerSocket(1211);
		System.out.println("running");
		Socket socket = server.accept();

		ObjectInputStream inFromClient = new ObjectInputStream(socket.getInputStream());
		
		Person p = (Person) inFromClient.readObject();	
		
		String egn = p.getEgn();
		
		int yearBorn = Integer.parseInt("19" + egn.substring(0, 2));
		
		int age = 2016 - yearBorn;
				
		PrintStream printout = new PrintStream(socket.getOutputStream());
		printout.println(age);
		
		server.close();
	}
}
