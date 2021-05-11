import java.net.*;
class DatagramReceiver

{

private final static int BUFSIZE=20;

public static void main(String a[])

{

try
{

int port=Integer.parseInt(a[0]);

Datagramsocket ds=new Datagramsocket(port);

byte buffer[]=new byte[BUFSIZE];

while(true)

{

DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
ds.receive(dp);

String str=new String(dp.getData());

System.out.println(str);
}

}

catch(exception e)

{

e.printstackTrace();

}

}

}