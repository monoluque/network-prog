package task01;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client
{
	public static void main(String[] args) throws IOException
	{

		Socket s = new Socket("10.10.192.57",2555);
		InputStream in = s.getInputStream();

		int b;
		while ((b = in.read()) != -1)
		{

			System.out.print((char)b);
		}

	System.out.println("");
	in.close();
	}
}