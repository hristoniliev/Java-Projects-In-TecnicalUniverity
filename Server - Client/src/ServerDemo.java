import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		String message;
		ServerSocket server = new ServerSocket(3);
		System.out.println("Server is activated");
		Socket socket = server.accept();
		Scanner scan = new Scanner(socket.getInputStream());
		Scanner scan1 = new Scanner(System.in);
		while (true) {
			message = scan.nextLine();
			System.out.println("Chris:" + message);
			PrintStream printout = new PrintStream(socket.getOutputStream());
			//System.out.println(message);
			System.out.print("Me:");
			printout.println("iCO: " + scan1.nextLine());
		}
		
	}
	
}
