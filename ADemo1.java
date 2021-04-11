class MOBException extends Exception
{
private int age;
MOBException(int age)
{
this.age=age;
}
public String toString()
{
return("the age is:"+age);
}
}
class ADemo1
{
public static void main(String args[])
{
try{
int a=9;
if(a<18)
throw new MOBException(a);
System.out.println("the age is:"+a);
}
catch(MOBException me)
{
System.out.println(me);
}
}
}