import tcpWork.*;

public class Server
{
	public static void main(String[] args)
	{
		MetroServer server = new MetroServer(7891);
		server.start();
	}
}