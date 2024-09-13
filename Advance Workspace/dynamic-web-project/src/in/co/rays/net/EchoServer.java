package in.co.rays.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {

		ServerSocket sSocket = new ServerSocket(4444);

		System.out.println("Echo server is started....");

		Socket client = null;

		boolean flag = true;

		while (flag) {

			client = sSocket.accept();

			talk(client);
		}

		sSocket.close();

		System.out.println("Echo Server is closed...");

	}

	public static void talk(Socket client) throws IOException {

		PrintWriter out = new PrintWriter(client.getOutputStream(), true);

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		String line = in.readLine();

		while (line != null) {

			System.out.println("Server Recived>>>>> " + line);

			out.println(line + "...." + line);

			if (line.equals("bye")) {

				break;

			}

			line = in.readLine();
		}

		out.close();
		in.close();
		client.close();
	
	}

}
