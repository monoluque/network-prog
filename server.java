
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
        public static void main(String [] args) throws IOException
        {

                ServerSocket ss = new ServerSocket(2555);
                System.out.println("Sd1");

                Socket s = ss.accept();
                Writer out = new OutputStreamWriter(s.getOutputStream());
                out.write("Message from Sd1's Server");

                out.flush();
                out.close();
          }
}
