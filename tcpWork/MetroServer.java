package tcpWork;

import java.io.*;
import java.net.*;

public class MetroServer extends Thread
{
	private MetroCardBank bank = null;
	private ServerSocket servSock = null;
	private int serverPort = -1;

	public MetroServer(int port)
	{
		this.bank = new MetroCardBank();
		this.serverPort = port;
	}

	@Override
	public void run() {
		try
		{
			this.servSock = new ServerSocket(serverPort);
			System.out.println("Metro Server started");
			while (true)
			{
				System.out.println("New Client Waiting...");
				Socket sock = servSock.accept();
				System.out.println("New client: " + sock);
				ClientHandler ch = new ClientHandler(this.getBank(), sock);
				ch.start();
			}
		}

		catch (IOException e)
		{
			System.out.println("Error: " + e);
		}

		finally
		{
			try
			{
				servSock.close();
				System.out.println("Metro Server stopped");
			}
			catch (IOException ex)
			{
				System.out.println("Error: " + ex);
			}
		}
	}

	public MetroCardBank getBank()
	{
		return bank;
	}
}