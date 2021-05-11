import java.io.*;

class FRead

{

public static void main(String a[])throws IOException,FileN

{

InputStream is=new FileInputStream("FRead.java");

int size=is.available();

for(int i=0;i<size;i++)

System.out.print((char)is.read());

is.close();

}

}