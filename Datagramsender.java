import java.net.*;

class Datagramsender

{

public static void main(String a[])

{

try{
InetAddress ia=InetAddress.getByteName(a[0]);

int port=Integer.parseInt(a[1]);

Datagramsocket ds=new DatagarmSocket();

byte buffer[]=a[2].getBytes();

DatagramPacket dp=new DatagramPacket(buffer.buffer.length,ia,ds.send(dp));

}

catch(Exception e)

{

e.printstackTrace();

}

}

}