class x
{
public void display()
{
System.out.println("class x");
}
}
class Y extends x
{
public void display()
{
System.out.println("class Y");
}
}
class overriding
{
public static void main(String a[])
{
x x1=new Y();
x1.display();
}
}
