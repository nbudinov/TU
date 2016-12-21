import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 1211);	
		
		ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
		
		Scanner inputScan = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = inputScan.nextLine();
		System.out.println("Enter VALID egn. (che proverki nqma :D )");
		String egn = inputScan.nextLine();
		
		Person person = new Person(name, egn);
		
		outToServer.writeObject(person);
		
		InputStreamReader is = new InputStreamReader(socket.getInputStream());
		
		char[] buff = new char[100];
		is.read(buff);
		
		String age = new String(buff);
		System.out.println("Your age is " + age);
		
		socket.close();
	}
	
}
